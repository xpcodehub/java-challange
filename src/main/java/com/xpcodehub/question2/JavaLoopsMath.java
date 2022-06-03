package com.xpcodehub.question2;

import java.util.ArrayList;
import java.util.List;

public class JavaLoopsMath {

// TODO Questão 2 do README.md

    public List<Integer> solucao(int entrada) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(entrada*i);
        }
        return result; 
    }

}
