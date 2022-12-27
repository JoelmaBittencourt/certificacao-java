package org.example.condicionais;

/*
De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
 */

class TesteIr2 {//erro falando que não posso usar boolean e double  com a classe com publioo

    public static <bigdecimal> void main(String[] args) {
        System.out.println("Calculando IR sobre salario");
        double salario = 9000.00;

        if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println(" o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("o IR é de 15% e pode deduzir R$ 350");
        } else if (salario >= 3752.1 && salario <= 4664.0) ;//tudo cai aqui , por que?
        System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
    }
}



