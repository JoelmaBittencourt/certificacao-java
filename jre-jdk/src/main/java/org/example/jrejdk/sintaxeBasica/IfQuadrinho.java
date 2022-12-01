package org.example.jrejdk.sintaxeBasica;

public class IfQuadrinho {

    public static void main(String[] args) {
        boolean temBatata = true;
        int ovos =6;

        if(temBatata) { //não precisa de comparação
            ovos = 9;
        }//senão
        System.out.println("compre " + ovos + " ovos");
    }
}
