package com.xpcodehub.question2;

import java.util.List;

public class JavaLoopsMath {

// TODO Questão 2 do README.md

    public List<Integer> solucao(int entrada) {
        int numberOfPositions = 10;
        List<Integer> list = new List<Integer>();
        for (int i = 1; i <= numberOfPositions; i++) {
            list.add(entrada * i);
        }

        return list;
    }

}
