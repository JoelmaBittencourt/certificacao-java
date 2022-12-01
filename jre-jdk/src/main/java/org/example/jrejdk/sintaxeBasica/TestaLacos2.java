package org.example.jrejdk.sintaxeBasica;
/*
for, while e if não precisam de chaves se tiverem apenas uma linha de instrução
 */
public class TestaLacos2 {
    public static void main(String[] args) {
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna <= 10; coluna++) {
                if(coluna > linha){
                    break;//Para a execução do laço mais interno que contém o comando break e continua executando os laços mais externos.
                }
                System.out.print("*");

            }
            System.out.println( "   ");
        }
    }
}
