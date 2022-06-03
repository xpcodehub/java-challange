package com.xpcodehub.question1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JavaIfElseTest {
    JavaIfElse javaIfElse = new JavaIfElse();

    @Test
    void quandoImparDeveRetornarImprevisivel() {
        for (int entradaImpar = 1; entradaImpar <= 100; entradaImpar++) {
            if (entradaImpar%2!=0){
                Assertions.assertEquals("Imprevisivel" , javaIfElse.solucao(entradaImpar));
            }
        }
    }

    @Test
    void quandoParEEstiverNoIntervaloDe2a5RetornePrevisivel() {
        Assertions.assertEquals("Previsivel", javaIfElse.solucao(4));
        Assertions.assertEquals("Previsivel", javaIfElse.solucao(2));
    }

    @Test
    void quandoParEEstiverNoIntervaloDe6a20RetorneImprevisivel() {
        for (int entradaPar = 6; entradaPar <= 20; entradaPar++) {
            if (entradaPar%2==0){
                Assertions.assertEquals("Imprevisivel" , javaIfElse.solucao(entradaPar));
            }
        }
    }

    @Test
    void quandoParEMaiorQue20Previsivel() {
        for (int entradaPar = 21; entradaPar <= 100; entradaPar++) {
            if (entradaPar%2==0){
                Assertions.assertEquals("Previsivel" , javaIfElse.solucao(entradaPar));
            }
        }
    }
}
