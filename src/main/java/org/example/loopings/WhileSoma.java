package org.example.loopings;

public class WhileSoma {
    public static void main(String[] args) {
        double soma = 0;
        int contador = 0;

        while (contador < 35) {
            double valorDoLivro = 50.50;
            soma = soma + valorDoLivro;
            contador = contador + 1;
        }
    }
}