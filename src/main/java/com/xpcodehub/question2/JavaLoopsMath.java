package com.xpcodehub.question2;

import java.util.ArrayList;
import java.util.List;

public class JavaLoopsMath {

    public List<Integer> solucao(int entrada) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add((entrada * i));
        }
        return list;
    }

}
