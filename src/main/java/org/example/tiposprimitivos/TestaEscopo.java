package org.example.tiposprimitivos;

public class TestaEscopo {

        public static void main(String[] args) {
            System.out.println("testando condicionais");

            int idade = 20;
            int quantidadePessoas = 3;

            // boolean acompanhado = quantidadePessoas >= 2;

            boolean acompanhado;
           // boolean acompanhado = false;

            if (quantidadePessoas >= 2) {
                acompanhado = true; //variavel acompanhado só existe até fechar as chaves
            } else {
                acompanhado = false;//variaveis não inicializadas não tem valor, no caso precisa de um else por que o boolean não teria o false como padrão a menos que tenha iniciado no escopo de toda a classe
            }

            System.out.println("valor de acompanhado = " + acompanhado);

            if (idade >= 18 && acompanhado) {
                System.out.println("seja bem vindo");
            } else {
                System.out.println("infelizmente você não pode entrar");
            }
        }
    }

