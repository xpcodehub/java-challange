package com.xpcodehub.question2;

import java.util.ArrayList;
import java.util.List;

public class JavaLoopsMath {

// TODO Questão 2 do README.md

    public List<Integer> solucao(int entrada) {
        var tabuada = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            tabuada.add(entrada*i);
        }
        return tabuada;
    }

}
