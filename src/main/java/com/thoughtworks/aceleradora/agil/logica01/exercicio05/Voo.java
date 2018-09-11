package com.thoughtworks.aceleradora.agil.logica01.exercicio05;

import java.util.Objects;
import java.util.stream.Stream;

import static java.lang.String.format;
import static java.util.stream.Collectors.joining;

public class Voo {

    private final String origem;
    private final String destino;
    private final String equipamento;
    private final int duracao;

    public Voo(String origem, String destino, String equipamento, int duracao) {
        this.origem = origem;
        this.destino = destino;
        this.equipamento = equipamento;
        this.duracao = duracao;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public int getDuracao() {
        return duracao;
    }

    private int duracaoEmHoras() {
        return duracao / 60;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voo voo = (Voo) o;
        return Objects.equals(origem, voo.origem) &&
                Objects.equals(destino, voo.destino) &&
                Objects.equals(equipamento, voo.equipamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origem, destino, equipamento);
    }

    @Override
    public String toString() {
        return Stream
                .of(
                        origem, ">", destino,
                        format("(%s)", equipamento),
                        format("%dh", duracaoEmHoras())
                )
                .collect(joining(" "));
    }
}
