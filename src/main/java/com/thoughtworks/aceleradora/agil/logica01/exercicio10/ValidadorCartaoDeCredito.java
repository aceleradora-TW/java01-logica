package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import java.util.function.Predicate;

public class ValidadorCartaoDeCredito {

    public static boolean ehValido(String numero) {

        String semEspacos = numero.replaceAll(" ", "");

        String semSujeira = semEspacos.replaceAll("[^\\d]", "");

        if (semEspacos.length() != semSujeira.length()) {
            return false;
        }

        if (semSujeira.length() <= 1) {
            return false;
        }

        CalculadoraLuhn calculadoraLuhn = new CalculadoraLuhn();

        String[] valores = semSujeira.split("");

        return ehDivisivelPorDez(calculadoraLuhn.somaLuhn(valores));
    }

    private static boolean ehDivisivelPorDez(int valor) {
        return valor % 10 == 0;
    }
}
