package org.example.tiposprimitivos;

/*
Em caso de precisar de varios ifs, switch case substituiria

 */
public class TestaMes {


        public static void main(String[] args) {

            int mes = 10;

            switch (mes) {
                case 1:
                    System.out.println("O mês é Janeiro");
                    break;//para a aplicaçaõ para não passar pra proxima condição caso uma seja escolhida
                case 2:
                    System.out.println("O mês é Fevereiro");
                    break;
                case 3:
                    System.out.println("O mês é Março");
                    break;
                case 4:
                    System.out.println("O mês é Abril");
                    break;
                case 5:
                    System.out.println("O mês é Maio");
                    break;
                case 6:
                    System.out.println("O mês é Junho");
                    break;
                case 7:
                    System.out.println("O mês é Julho");
                    break;
                case 8:
                    System.out.println("O mês é Agosto");
                    break;
                case 9:
                    System.out.println("O mês é Setembro");
                    break;
                case 10:
                    System.out.println("O mês é Outubro");
                    break;
                case 11:
                    System.out.println("O mês é Novembro");
                    break;
                case 12:
                    System.out.println("O mês é Dezembro");
                    break;
                default://else
                    System.out.println("Mês inválido");
                    break;
            }
        }
    }

