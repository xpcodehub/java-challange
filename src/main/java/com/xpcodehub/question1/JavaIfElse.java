package com.xpcodehub.question1;

public class JavaIfElse {

// TODO Questão 1 do README.md
    public String solucao(int entrada) {
        return entrada % 2 == 0 && ((entrada >= 2 && entrada <=5) || entrada > 20) ? "Previsivel" : "Imprevisivel";
    }
}
