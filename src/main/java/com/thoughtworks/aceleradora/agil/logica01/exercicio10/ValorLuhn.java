package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import java.util.function.IntFunction;

import static java.lang.Integer.parseInt;

class ValorLuhn {

    final int indice;
    final int valor;
    final int tamanhoNumero;

    private ValorLuhn(int indice, int valor, int tamanhoNumero) {
        this.indice = indice;
        this.valor = valor;
        this.tamanhoNumero = tamanhoNumero;
    }

    static IntFunction<ValorLuhn> paraValorLuhnIndexado(String[] fonte) {
        return (indice) -> new ValorLuhn(indice, parseInt(fonte[indice]), fonte.length - 1);
    }

    public int paraInteiro() {
        return ehIndiceLuhn(indice, tamanhoNumero)
                ? dobra(valor)
                : valor;
    }

    private int dobra(int valor) {
        return valor * 2 > 9
                ? valor * 2 - 9
                : valor * 2;
    }

    private boolean ehIndiceLuhn(int indiceAtual, int tamanhoNumero) {
        return ehPar(tamanhoNumero)
                ? ehImpar(indiceAtual)
                : ehPar(indiceAtual);
    }

    private boolean ehPar(int valor) {
        return valor % 2 == 0;
    }

    private boolean ehImpar(int valor) {
        return !ehPar(valor);
    }
}
