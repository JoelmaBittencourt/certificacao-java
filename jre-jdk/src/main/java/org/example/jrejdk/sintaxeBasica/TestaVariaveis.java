package org.example.jrejdk.sintaxeBasica;
//em roxo são palavras reservadas, sempre minusculas
public class TestaVariaveis {
    public static void main(String[] args){
        System.out.println("Ola, mundo");
        System.out.println(""); //pula linha
        System.out.println("oii");

        int idade = 37;
        System.out.println(idade);

        idade = 30 + 20;

        System.out.println(idade);

        idade = (7 * 3) + 9;

        System.out.println(idade);

        System.out.println("A idade é " + idade);//sem ln não pula linha

        System.out.print("A idade é ".concat(String.valueOf(idade)));

    }
}
