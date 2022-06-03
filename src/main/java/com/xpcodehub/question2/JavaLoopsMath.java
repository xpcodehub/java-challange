package com.xpcodehub.question2;

import java.util.ArrayList;
import java.util.List;

public class JavaLoopsMath {

    private static final int LOOP_REPETITIONS = 10;

    public List<Integer> solucao(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= LOOP_REPETITIONS; i++) {
            list.add(n * i);
        }
        return list;
    }

}
