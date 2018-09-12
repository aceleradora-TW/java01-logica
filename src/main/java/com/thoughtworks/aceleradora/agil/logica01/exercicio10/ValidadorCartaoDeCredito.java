package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

class ValidadorCartaoDeCredito {

    private static final String NAO_NUMERICOS = ".*[\\D].*";

    static boolean ehValido(final String numeroCompleto) {

        String valorSemEspacos = numeroCompleto.replaceAll(" ", "");

        if (!ehProcessavel(valorSemEspacos)) {
            return false;
        }

        CalculadoraLuhn calculadoraLuhn = new CalculadoraLuhn();

        String[] valores = valorSemEspacos.split("");

        return ehDivisivelPorDez(calculadoraLuhn.soma(valores));
    }

    private static boolean ehProcessavel(final String valorSemEspaco) {
        return (!valorSemEspaco.matches(NAO_NUMERICOS)) && valorSemEspaco.length() > 1;
    }

    private static boolean ehDivisivelPorDez(int valor) {
        return valor % 10 == 0;
    }
}
