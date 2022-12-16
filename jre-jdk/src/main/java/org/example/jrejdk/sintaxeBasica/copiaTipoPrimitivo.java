package org.example.jrejdk.sintaxeBasica;
/*
Um detalhe simples, porém muito importante, sobre os tipos primitivos
é que, quando você atribui um valor para eles (utilizando o operador =),
este valor será copiado para a sua variável. Por exemplo, repare no seguinte
código:

Ou seja, a variável numeroDois guardou uma cópia
do valor, e não uma referência a ela ou algo do tipo.
 */
public class copiaTipoPrimitivo {
    public static void main(String[] args) {

        int numeroUm = 4;//numeroum = 4
        int numeroDois = numeroUm;// = 4 assim como numeroUm

        numeroUm = numeroUm + 5; //numero um mudou pois agora soma com o 5 mas nada acontece com numeroDois pois
       // numeroDois = numeroUm;

        System.out.println("numeroUm " + numeroUm);
        System.out.println("numeroDois " + numeroDois);
    }
}