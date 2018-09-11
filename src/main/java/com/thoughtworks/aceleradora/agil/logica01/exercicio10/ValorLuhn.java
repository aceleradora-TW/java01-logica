package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import java.util.function.IntFunction;

import static java.lang.Integer.parseInt;

class ValorLuhn {

    final int indice;
    final int valor;

    private ValorLuhn(int indice, int valor) {
        this.indice = indice;
        this.valor = valor;
    }

    static IntFunction<ValorLuhn> paraValorLuhnIndexado(String[] fonte) {
        return (indice) -> new ValorLuhn(indice, parseInt(fonte[indice]));
    }

    public int paraInteiro(int tamanhoNumero) {
        return ehIndiceLuhn(indice, tamanhoNumero - 1)
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
