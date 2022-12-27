package org.example.condicionais;


//AND é representado pelo && e OR pelo ||.
public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 25;
        int quantidadePessoas = 0;
        boolean acompanhado = false;

        int idade2 = 68;
        boolean ehIdoso = idade2 >= 65;

        System.out.println(ehIdoso);


    if (idade >= 18 || acompanhado == true) { //true ou false, opcional
        System.out.println("Bem vindo,pode entrar");
    }
        else if(idade <= 18 && quantidadePessoas >= 2) {
            System.out.println("menor mas acompanhado de duas ou mais pessoas, pode entrar");
    }else{
            System.out.println("menor sem acompanhante não pode entrar");
    }
    }
}

