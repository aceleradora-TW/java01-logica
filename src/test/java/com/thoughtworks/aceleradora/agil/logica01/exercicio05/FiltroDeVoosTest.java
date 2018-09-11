package com.thoughtworks.aceleradora.agil.logica01.exercicio05;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FiltroDeVoosTest {

    private FiltroDeVoos filtroDeVoos;

    @Before
    public void setUp() {
        filtroDeVoos = new FiltroDeVoos(asList(
                new Voo("POA", "SCL", "787-900", 240),
                new Voo("POA", "MIA", "767-800", 460),
                new Voo("SCL", "PMC", "A320", 140),
                new Voo("CWB", "GRU", "A320", 120),
                new Voo("SCL", "CCP", "A321", 120))
        );
    }

    @Test
    public void filtraPorDuracao() {
        List<Voo> resultado = filtroDeVoos.durandoMaisQue(140);

        assertThat(resultado.size(), equalTo(2));
        assertThat(resultado.get(0), equalTo(new Voo("POA", "SCL", "787-900", 240)));
        assertThat(resultado.get(1), equalTo(new Voo("POA", "MIA", "767-800", 460)));
    }

    @Test
    public void filtraPorPartida() {
        List<Voo> resultado = filtroDeVoos.saindoDe("POA");

        assertThat(resultado.size(), equalTo(2));
        assertThat(resultado.get(0), equalTo(new Voo("POA", "SCL", "787-900", 240)));
        assertThat(resultado.get(1), equalTo(new Voo("POA", "MIA", "767-800", 460)));
    }

    @Test
    public void filtraPorChegada() {
        List<Voo> resultado = filtroDeVoos.chegandoEm("CCP");

        assertThat(resultado.size(), equalTo(1));
        assertThat(resultado.get(0), equalTo(new Voo("SCL", "CCP", "A321", 120)));
    }

    @Test
    public void filtraPorEquipamento() {
        List<Voo> resultado = filtroDeVoos.operadoPor("A320");

        assertThat(resultado.size(), equalTo(2));
        assertThat(resultado.get(0), equalTo(new Voo("SCL", "PMC", "A320", 140)));
        assertThat(resultado.get(1), equalTo(new Voo("CWB", "GRU", "A320", 120)));
    }
}