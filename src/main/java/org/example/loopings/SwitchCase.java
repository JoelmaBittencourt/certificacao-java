package org.example.loopings;

import java.util.Scanner;

/*
funciona como multiplos if else
se colocasse no lugar do else if somente if pegaria o senao

 */
public class SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int diaDaSemana = scan.nextInt();
        System.out.println("Digite o dia da semana, de 1 a 7");

//        if (diaDaSemana == 1) {
//            System.out.println("Domingo");
//        } else if (diaDaSemana == 2) {
//            System.out.println("Segunda");
//        } else if (diaDaSemana == 3) {
//            System.out.println("Terça");
//        } else if (diaDaSemana == 4) {
//            System.out.println("Quarta");
//        } else if (diaDaSemana == 5) {
//            System.out.println("Quinta");
//        } else if (diaDaSemana == 6) {
//            System.out.println("Sexta");
//        } else if (diaDaSemana == 7) {
//            System.out.println("Sabado");
//        } else {
//            System.out.println("dia invalido");
//

 //   }

    switch (diaDaSemana){
        case 1: System.out.println("Domingo");break;
        case 2: System.out.println("Segunda");break;
        case 3: System.out.println("Terça");break;
        case 4: System.out.println("Quarta");break;
        case 5: System.out.println("Quinta");break;
        case 6: System.out.println("Sexta");break;
        case 7: System.out.println("Sabado");break;
        default: System.out.println("invalido");
}
}

}