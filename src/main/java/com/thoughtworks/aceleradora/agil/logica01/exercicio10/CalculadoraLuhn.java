package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import static com.thoughtworks.aceleradora.agil.logica01.exercicio10.ValorLuhn.paraValorLuhnIndexado;
import static java.util.stream.IntStream.range;

public class CalculadoraLuhn {

    public int somaLuhn(String[] valores) {
        return range(0, valores.length)
                .mapToObj(paraValorLuhnIndexado(valores))
                .mapToInt(ValorLuhn::paraInteiro)
                .sum();
    }
}
