package org.example.jrejdk.sintaxeBasica;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestaConversao {
    public static void main(String[]args){
//        double salario = 1250.00;
//        int valor = salario;

        double salario = 1250.00;
        int valor = (int) salario;//cast mudando o tipo do objeto, to string

        System.out.println(valor);
        double outroValor =3;

        double valor1 = 0.2;
        double valor2 = 0.1;

        System.out.println(valor2 + valor1);
        System.out.println("soma de 0.2 + 0.1 = " + (valor2 + valor1));
        BigDecimal resultado = new BigDecimal(valor2 + valor1).setScale(2, RoundingMode.DOWN);//arredonda
        System.out.println(resultado);//formata
    }
}