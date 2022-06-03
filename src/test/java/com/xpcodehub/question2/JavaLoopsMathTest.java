package com.xpcodehub.question2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class JavaLoopsMathTest {
    JavaLoopsMath javaLoopsMath = new JavaLoopsMath();

    @Test
    void deveSerRetornadoOsDezMultiplosDoNumeroDoIntervalo1A100() {
        for (int i = 1; i <= 100; i++) {
            var tabuada = new ArrayList<Integer>();
            for (int j = 1; j <= 10; j++) {
                tabuada.add(i * j);
            }
            Assertions.assertEquals(tabuada, javaLoopsMath.solucao(i));
        }
    }
}
