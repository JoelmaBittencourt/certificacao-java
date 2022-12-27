package org.example.tiposprimitivos;

public class TestaPontoFlutuante {
    public static void main(String[] args) {
        double salario = 1250.00;
        double extra = 1200.00;

        System.out.println("Meu salario é ".concat(String.valueOf(salario).concat( " A hora extra é ".concat(String.valueOf(extra)))));
        System.out.println("Meu salario é " + salario + " minhas extras somaram "+ extra);

        double valorHoraExtra = 7;
        System.out.println("valor da Hora extra é ".concat(String.valueOf(valorHoraExtra)));
        System.out.println("valor da Hora extra " + valorHoraExtra);

        double divisao = 3.14/2;
        System.out.println("3.14/2 = " + divisao);

        int divisao2 = 5/2;
        System.out.println("5/2 = " + divisao2);//int não contabiliza numeros quebrados

        double divisaod = 5/2; //mesmo sendo double numeros inteiros não contabilizam numeros quebrados por que a execução é feita da direita pra esquerda e vai ser contado como inteiro
        System.out.println("5/2 = "+ divisaod);

        double divisaoc = 5.0/2;
        System.out.println("5.0/2 = "+ divisaoc);//ao menos um dos numeros precisam ser do tipo double para gerar numeros quebrados

    }
}
