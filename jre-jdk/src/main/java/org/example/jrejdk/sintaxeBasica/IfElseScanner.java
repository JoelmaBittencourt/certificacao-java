package org.example.jrejdk.sintaxeBasica;

import java.util.Scanner;

public class IfElseScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade ");
        int idade = scanner.nextInt();

        if (idade == 0) {
            System.out.print("idade invalida ");
        }
        else if(idade > 5 ){
            System.out.print("idade invalida ");
        }
        else if(idade < 9){
            System.out.print("idade invalida ");
        }
        else{
            System.out.print("idade valida " + idade);
        }
    }
}
