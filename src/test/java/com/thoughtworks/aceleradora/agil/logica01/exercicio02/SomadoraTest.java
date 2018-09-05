package com.thoughtworks.aceleradora.agil.logica01.exercicio02;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class SomadoraTest {

    @Test
    public void deveSomarDoisNumerosInteiros() {

        assertThat(Somadora.soma(1, 1), equalTo(2));
    }
}