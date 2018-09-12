package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import java.util.ArrayList;
import java.util.List;

public class ValidadorCartaoDeCredito {

    public static boolean ehValido(final String numero) {
        char[] caracteres = numero.toCharArray();

        if (!ehProcessavel(caracteres)) {
            return false;
        }

        List<Integer> numeros = somenteNumeros(caracteres);

        int resultadoSoma = somaTudo(numeros);

        return resultadoSoma % 10 == 0;
    }

    private static boolean ehProcessavel(char[] caracteres) {

        int quantidadeDeNumeros = 0;

        for (int i = 0; i < caracteres.length; i++) {

            char caracter = caracteres[i];

            if (caracter == ' ') {
                continue;
            }

            if (!ehNumero(caracter)) {
                return false;
            }

            quantidadeDeNumeros++;
        }

        return quantidadeDeNumeros > 1;
    }

    private static boolean ehNumero(char valor) {
        int codigoAscii = Character.getNumericValue(valor);

        return codigoAscii >= 0 && codigoAscii <= 9;
    }

    private static List<Integer> somenteNumeros(char[] caracteres) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] != ' ') {
                numeros.add(Character.getNumericValue(caracteres[i]));
            }
        }

        return numeros;
    }

    private static int somaTudo(List<Integer> numeros) {

        int resultado = 0;

        int indiceInicial = numeros.size() - 1;

        for (int i = indiceInicial; i >= 0; i--) {
            int valorMultiplicado = multiplicacaoLuhn(i, numeros.get(i), indiceInicial);

            resultado += valorMultiplicado;
        }

        return resultado;
    }

    private static int multiplicacaoLuhn(int indice, int valor, int indiceInicial) {

        if (!deveDobrar(indice, indiceInicial)) {
            return valor;
        }

        int valorDobrado = valor * 2;

        if (valorDobrado > 9) {
            return valorDobrado - 9;
        }

        return valorDobrado;
    }

    private static boolean deveDobrar(int indice, int indiceInicial) {

        if (ehPar(indiceInicial)) {
            return ehImpar(indice);
        }

        return ehPar(indice);
    }

    private static boolean ehPar(int valor) {
        return valor % 2 == 0;
    }

    private static boolean ehImpar(int valor) {
        return !ehPar(valor);
    }
}
