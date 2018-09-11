package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import static com.thoughtworks.aceleradora.agil.logica01.exercicio10.ValorLuhn.paraValorLuhn;
import static java.util.stream.IntStream.range;

public class CalculadoraLuhn {

    public int soma(String[] valores) {
        return range(0, valores.length)
                .mapToObj(paraValorLuhn(valores))
                .mapToInt(ValorLuhn::paraInteiro)
                .sum();
    }
}
