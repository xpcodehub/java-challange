package com.xpcodehub.question1;

public class JavaIfElse {

// TODO Questão 1 do README.md
    public String solucao(int entrada) {
        if (entrada%2!=0) {
            return "Imprevisivel";
        }

        if (entrada <= 5) {
            return "Previsivel";
        }

        if (entrada <= 20) {
            return "Imprevisivel";
        }

         return "Previsivel";
    }
}
