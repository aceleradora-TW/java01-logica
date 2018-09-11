package com.thoughtworks.aceleradora.agil.logica01.exercicio03;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void deveRetornarFizz() {
        assertThat(FizzBuzz.calculaFizzBuzz(3), equalTo("Fizz"));
    }

    @Test
    public void deveRetornarBuzz() {
        assertThat(FizzBuzz.calculaFizzBuzz(5), equalTo("Buzz"));
    }

    @Test
    public void deveRetornarFizzBuzz() {
        assertThat(FizzBuzz.calculaFizzBuzz(15), equalTo("FizzBuzz"));
    }

    @Test
    public void deveRetornar8() {
        assertThat(FizzBuzz.calculaFizzBuzz(8), equalTo("8"));
    }
}