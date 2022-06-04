package com.xpcodehub.question2;

import java.util.ArrayList;
import java.util.List;

public class JavaLoopsMath {

// TODO Questão 2 do README.md

    public List<Integer> solucao(int entrada) {
        ArrayList<Integer> list = new ArrayList<>(10);

        for(int i =0;i<10;i++){
            list.add((i+1)*entrada);
        }
        return list;
    }

}
