package org.example.jrejdk.sintaxeBasica;

public class TestaCaracteres {
/*
tabela ascii cada letra corresponde a um numero
 */
    public static void main(String[] args){
        char letra = 'a'; //so da pra trabalhar com uma unica letra
        System.out.println(letra);

        char valor =66;
        System.out.println(valor);

        System.out.println(valor + 1);


        char valor2 = 65;           // Compila!
        System.out.println(valor2);

       // valor = valor + 1;         // Não compila!
        System.out.println(valor);

        System.out.println("alura cursos de tecnologia" + 2020);//converte tudo em string
    }
}
