package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class ValidadorCartaoDeCredito {

    private static final String NAO_NUMERICOS = "[^\\d]";

    public static boolean ehValido(String numero) {

        int tamanhoSemEspacos = numero.replaceAll(" ", "").length();

        String[] somenteNumeros = numero.replaceAll(NAO_NUMERICOS, "").split("");

        if (somenteNumeros.length <= 1 || tamanhoSemEspacos != somenteNumeros.length) {
            return false;
        }

        exibeDetalhesNumero(somenteNumeros);

        int resultado = 0;

        int indiceInicial = somenteNumeros.length - 1;

        for (int i = indiceInicial; i >= 0; i--) {
            int valorInteiro = Integer.parseInt(somenteNumeros[i]);

            int valorLuhn = calculaValorLuhn(valorInteiro, i, indiceInicial);

            System.out.print("(" +valorInteiro + " > " + valorLuhn + ") {" + (resultado + valorLuhn) + "} ");

            resultado += valorLuhn;
        }

        System.out.println();
        System.out.println("Soma: " + resultado);
        System.out.println();

        return resultado % 10 == 0;
    }

    private static int calculaValorLuhn(int numero, int indice, int indiceInicial) {
        if (!ehIndiceLuhn(indice, indiceInicial)) {
            return numero;
        }

        int valorDobrado = numero * 2;

        if (valorDobrado > 9) {
            return valorDobrado - 9;
        }

        return valorDobrado;
    }

    private static boolean ehIndiceLuhn(int indiceAtual, int indiceInicial) {
        if (ehPar(indiceInicial)) {
            return ehImpar(indiceAtual);
        }

        return ehPar(indiceAtual);
    }

    private static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    private static boolean ehImpar(int numero) {
        return !ehPar(numero);
    }

    private static void exibeDetalhesNumero(String[] somenteNumeros) {
        System.out.println();
        System.out.println("Numero: " + Arrays.toString(somenteNumeros));
        List<String> reverso = Stream.of(somenteNumeros).collect(Collectors.toList());
        Collections.reverse(reverso);
        System.out.println("Reverso: " + reverso.stream().collect(joining(", ")));
    }
}
