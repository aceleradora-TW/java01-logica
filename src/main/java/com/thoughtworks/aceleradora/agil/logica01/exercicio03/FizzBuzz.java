package com.thoughtworks.aceleradora.agil.logica01.exercicio03;

public class FizzBuzz {

    public static String calculaFizzBuzz(int numero) {

        boolean ehFizz = numero % 3 == 0;
        boolean ehBuzz = numero % 5 == 0;

        if (ehFizz && ehBuzz) {
            return "FizzBuzz";
        }

        if (ehFizz) {
            return "Fizz";
        }

        if (ehBuzz) {
            return "Buzz";
        }

        return Integer.toString(numero);
    }
}
