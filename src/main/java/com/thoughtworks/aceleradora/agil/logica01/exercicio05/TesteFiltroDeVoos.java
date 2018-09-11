package com.thoughtworks.aceleradora.agil.logica01.exercicio05;

import java.util.List;

import static java.util.Arrays.asList;

public class TesteFiltroDeVoos {

    public static FiltroDeVoos filtro = new FiltroDeVoos(asList(
            new Voo("POA", "SCL", "787-900", 240),
            new Voo("POA", "MIA", "767-800", 465),
            new Voo("SCL", "PMC", "A320", 140),
            new Voo("CWB", "GRU", "A320", 120),
            new Voo("SCL", "CCP", "A321", 120))
    );

    public static void main(String[] args) {
        testaFiltroPorDuracao();
    }

    public static void testaFiltroPorDuracao() {
        List<Voo> resultado = filtro.durandoMaisQue(140);

        System.out.println("Voos encontrados com duracao maior que 140min:");

        for (int i = 0; i < resultado.size(); i++) {
            Voo voo = resultado.get(i);
            System.out.println(voo.toString());
        }
    }
}
