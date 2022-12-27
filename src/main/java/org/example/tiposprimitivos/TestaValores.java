package org.example.tiposprimitivos;

public class TestaValores {
    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro + segundo;

        primeiro = 10;//não pega esse valor
        System.out.println(segundo);
    }
}
