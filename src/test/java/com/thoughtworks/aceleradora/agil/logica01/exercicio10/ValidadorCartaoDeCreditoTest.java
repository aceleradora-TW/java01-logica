package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidadorCartaoDeCreditoTest {

    @Test
    public void testSingleDigitStringInvalid() {
        assertFalse(ValidadorCartaoDeCredito.ehValido("1"));
    }

    @Test
    public void testSingleZeroIsInvalid() {
        assertFalse(ValidadorCartaoDeCredito.ehValido("0"));
    }

    @Test
    public void testSimpleValidSINReversedRemainsValid() {
        assertTrue(ValidadorCartaoDeCredito.ehValido("059"));
    }

    @Test
    public void testSimpleValidSINReversedBecomesInvalid() {
        assertTrue(ValidadorCartaoDeCredito.ehValido("59"));
    }

    @Test
    public void testValidCanadianSINValid() {
        assertTrue(ValidadorCartaoDeCredito.ehValido("055 444 285"));
    }

    @Test
    public void testInvalidCanadianSINInvalid() {
        assertFalse(ValidadorCartaoDeCredito.ehValido("055 444 286"));
    }

    @Test
    public void testInvalidCreditCardInvalid() {
        assertFalse(ValidadorCartaoDeCredito.ehValido("8273 1232 7352 0569"));
    }

    @Test
    public void testStringsContainingNonDigitInvalid() {
        assertFalse(ValidadorCartaoDeCredito.ehValido("055a 444 285"));
    }

    @Test
    public void testStringContainingPunctuationInvalid() {
        assertFalse(ValidadorCartaoDeCredito.ehValido("055-444-285"));
    }

    @Test
    public void testStringContainingSymbolsInvalid() {
        assertFalse(ValidadorCartaoDeCredito.ehValido("055£ 444$ 285"));
    }

    @Test
    public void testSingleSpaceWithZeroInvalid() {
        assertFalse(ValidadorCartaoDeCredito.ehValido(" 0"));
    }

    @Test
    public void testMoreThanSingleZeroValid() {
        assertTrue(ValidadorCartaoDeCredito.ehValido("0000 0"));
    }

    @Test
    public void testDigitNineConvertedToOutputNine() {
        assertTrue(ValidadorCartaoDeCredito.ehValido("091"));
    }

    @Test
    public void testStringsWithNonDigitsInvalid() {
        assertFalse(ValidadorCartaoDeCredito.ehValido(":9"));
    }
}