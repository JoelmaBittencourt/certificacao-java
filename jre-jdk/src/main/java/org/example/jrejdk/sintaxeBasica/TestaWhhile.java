package org.example.jrejdk.sintaxeBasica;
/*
O while aceita receber dois valores, true e false. O valor true mantém o loop em execução,
já o false o finaliza. Esses valores podem ser resultados de uma expressão como contador <= 10.
Todavia, no código de Fernando, ele não incrementou a variável contador a cada iteração do while.
Devido a esse esquecimento, a variável contador sempre mantinha o valor 1 fazendo com que o
programa caísse em um loop infinito.
 */
public class TestaWhhile {

    public static void main(String[] args){
        int contador = 0;
        while( contador <= 10){//boolean
            System.out.println(contador);
           // System.out.println(contador = contador+1);
            contador += 1;
            contador++;
            ++contador;

        }
        System.out.println(contador);
    }
}
