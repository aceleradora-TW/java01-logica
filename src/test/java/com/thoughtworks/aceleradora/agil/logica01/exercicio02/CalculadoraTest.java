package com.thoughtworks.aceleradora.agil.logica01.exercicio02;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CalculadoraTest {

    @Test
    public void somaDoisNumerosInteiros() {
        assertThat(Calculadora.soma(1, 1), equalTo(2));
    }

    @Test
    public void subtraiDoisNumerosInteiros() {
        assertThat(Calculadora.subtrai(1, 1), equalTo(0));
        assertThat(Calculadora.subtrai(1, 2), equalTo(-1));
    }

    @Test
    public void multiplicaDoisNumerosInteiros() {
        assertThat(Calculadora.multiplica(2, 2), equalTo(4));
        assertThat(Calculadora.multiplica(4, 2), equalTo(8));
    }

    @Test
    public void divideDoisNumerosInteiros() {
        assertThat(Calculadora.divide(2, 2), equalTo(1));
        assertThat(Calculadora.divide(4, 2), equalTo(2));
    }
}