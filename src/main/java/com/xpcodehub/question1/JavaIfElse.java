package com.xpcodehub.question1;

public class JavaIfElse {
    public String solucao(int n) {
        if(n % 2 != 0 || (n >= 6 && n <= 20)) {
            return "Imprevisivel";
        } else{
            return "Previsivel";
        }
    }
}
