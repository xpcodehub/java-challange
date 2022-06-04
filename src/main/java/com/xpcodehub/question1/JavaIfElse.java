package com.xpcodehub.question1;

public class JavaIfElse {

// TODO Questão 1 do README.md
    public String solucao(int entrada) {
        if(entrada%2 == 1){
            return "Imprevisivel";
        }else if(entrada>=2  && entrada <=5){
            return "Previsivel";
        }else if(entrada>=6  && entrada <=20){
            return "Imprevisivel";
        }else if(entrada>20){
            return "Previsivel";
        }
        return "";
    }
}
