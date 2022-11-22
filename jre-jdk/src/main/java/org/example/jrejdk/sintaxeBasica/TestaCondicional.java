package org.example.jrejdk.sintaxeBasica;


public class TestaCondicional {
    public static void main(String[] args){
        System.out.println("Testando condicionais");
        int idade = 14;
        int quantidadePessoas = 2;

        if (idade >= 18)//com apenas um if não precisa de chaves
            System.out.println("maior de idade");//sem chaves so pode ter uma instrucao
        else
            System.out.println("menor de idade");

        if (idade >= 18) {
            System.out.println("maior de idade");
        }else{
            System.out.println("menor de idade");
        }



        if (idade >= 18) {
            System.out.println("maior de idade");
        }else{
            if(quantidadePessoas == 1){
                System.out.println("menor , mas pode entar por estar acompanhado");
            }else{
                System.out.println("não pode entrar");
            }
            System.out.println("menor de idade");
        }
    }
}
