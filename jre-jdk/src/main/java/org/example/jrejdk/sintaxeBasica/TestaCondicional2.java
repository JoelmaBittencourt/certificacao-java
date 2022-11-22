package org.example.jrejdk.sintaxeBasica;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 25;
        int quantidadePessoas = 0;
    if (idade >= 18) {
        System.out.println("Bem vindo,pode entrar");
    }
        else if(idade <= 18 && quantidadePessoas >= 2) {
            System.out.println("menor mas acompanhado de duas ou mais pessoas, pode entrar");
    }else{
            System.out.println("menor sem acompanhante não pode entrar");
    }
    }
}

