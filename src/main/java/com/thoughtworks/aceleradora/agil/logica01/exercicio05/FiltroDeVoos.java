package com.thoughtworks.aceleradora.agil.logica01.exercicio05;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class FiltroDeVoos {

    private final List<Voo> voos;

    public FiltroDeVoos(List<Voo> voos) {
        this.voos = voos;
    }

    public List<Voo> durandoMaisQue(int duracaoMinima) {
        List<Voo> voosLongos = new ArrayList<>();

        for (int i = 0; i < voos.size(); i++) {
            Voo voo = voos.get(i);

            if (voo.getDuracao() > duracaoMinima) {
                voosLongos.add(voo);
            }
        }

        return voosLongos;
    }

    public List<Voo> saindoDe(String cidade) {
        return emptyList();
    }

    public List<Voo> chegandoEm(String cidade) {
        return emptyList();
    }

    public List<Voo> operadoPor(String equipamento) {
        return emptyList();
    }
}
