package com.thoughtworks.aceleradora.agil.logica01.exercicio10;

import java.util.Optional;

import static com.thoughtworks.aceleradora.agil.logica01.exercicio10.ValorLuhn.paraValorLuhnIndexado;
import static java.util.stream.IntStream.range;

public class CalculadoraLuhn {

    public Optional<Integer> calcula(String[] valores) {
        return range(0, valores.length)
                .mapToObj(paraValorLuhnIndexado(valores))
                .map(valorLuhn -> valorLuhn.paraInteiro(valores.length))
                .reduce(Integer::sum);
    }

}
