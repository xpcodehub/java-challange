package com.xpcodehub.question1;

public class JavaIfElse {

    public String solucao(int entrada) {
        String retornoSolucao = null;
        if (isNumeroImpar(entrada)) {
            retornoSolucao = "Imprevisivel";
        } else {
            // isNumeroPar
            if (isNumeroIntervalo2a5(entrada)){
                retornoSolucao = "Previsivel";
            } else if (isNumeroIntervalo6a20(entrada)) {
                retornoSolucao = "Imprevisivel";
            } else if (isNumeroMaiorQue20(entrada)) {
                retornoSolucao = "Previsivel";
            }
        }
        return retornoSolucao;
    }

    private boolean isNumeroImpar(int entrada) {
        return (entrada % 2) != 0;
    }

    private boolean isNumeroIntervalo2a5(int entrada) {
        return entrada >= 2 && entrada <= 5;
    }

    private boolean isNumeroIntervalo6a20(int entrada) {
        return entrada >= 6 && entrada <= 20;
    }

    private boolean isNumeroMaiorQue20(int entrada) {
        return entrada > 20;
    }

}
