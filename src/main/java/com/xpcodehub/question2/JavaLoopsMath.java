package com.xpcodehub.question2;

import java.util.ArrayList;
import java.util.List;

public class JavaLoopsMath {

    private static final Integer LOOP_REPETITIONS = 10;

    // TODO Questão 2 do README.md
    public List<Integer> solucao(int entrada) {
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=LOOP_REPETITIONS; i++){
            list.add(entrada*i);
        }

        return list;
    }
}
