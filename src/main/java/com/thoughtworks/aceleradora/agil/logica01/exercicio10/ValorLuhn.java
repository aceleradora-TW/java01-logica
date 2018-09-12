package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import java.util.function.IntFunction;

import static java.lang.Integer.parseInt;

class ValorLuhn {

    private final int indice;
    private final int valor;
    private final int tamanhoNumero;

    private ValorLuhn(int indice, int valor, int tamanhoNumero) {
        this.indice = indice;
        this.valor = valor;
        this.tamanhoNumero = tamanhoNumero;
    }

    static IntFunction<ValorLuhn> paraValorLuhn(String[] fonte) {
        return (indice) -> new ValorLuhn(indice, parseInt(fonte[indice]), fonte.length - 1);
    }

    int paraInteiro() {
        return ehIndiceLuhn()
                ? valorDobrado()
                : valor;
    }

    private int valorDobrado() {
        return valor * 2 > 9
                ? valor * 2 - 9
                : valor * 2;
    }

    private boolean ehIndiceLuhn() {
        return ehPar(tamanhoNumero)
                ? ehImpar(indice)
                : ehPar(indice);
    }

    private boolean ehPar(int valor) {
        return valor % 2 == 0;
    }

    private boolean ehImpar(int valor) {
        return !ehPar(valor);
    }
}
