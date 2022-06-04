package com.xpcodehub.question2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaLoopsMath {

// TODO Questão 2 do README.md

    public List<Integer> solucao(int entrada) {
        return Stream.of(1,2,3,4,5,6,7,8,9,10)
                .map(x -> x * entrada)
                .collect(Collectors.toList());
    }

}
