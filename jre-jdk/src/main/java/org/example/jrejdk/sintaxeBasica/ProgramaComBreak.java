package org.example.jrejdk.sintaxeBasica;

public class ProgramaComBreak {
    public static void main(String[] args) {
        for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (coluna > linha  ) {
                    break;
                }
                System.out.print( linha + coluna );
            }
            System.out.println();
        }
    }
}

