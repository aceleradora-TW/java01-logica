package com.thoughtworks.aceleradora.agil.logica01.exercicio02;

public class Calculadora {

    public static int soma(int umNumero, int outroNumero) {
        return umNumero + outroNumero;
    }

    public static int subtrai(int umNumero, int outroNumero) {
        return umNumero - outroNumero;
    }

    public static int multiplica(int umNumero, int outroNumero) {
        return umNumero * outroNumero;
    }

    public static int divide(int divisor, int dividendo) {

        if (dividendo == 0) {
            throw new RuntimeException("Nao se pode dividir por zero");
        }

        return  divisor / dividendo;
    }
}
