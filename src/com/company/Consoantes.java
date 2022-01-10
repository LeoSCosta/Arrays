package com.company;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres, e
diga quantas consoantes foram lidas.
imprima as consoantes
*/
public class Consoantes {
        Scanner entrada = new Scanner(System.in);

    public void consoantes(){

        String[] vetor = new String[6];
        int qtdConsoantes = 0;

        for(int i= 0; i < vetor.length; i++){
            System.out.print("Digite um letra: ");
            String letra = entrada.next();
            if(!(letra.equalsIgnoreCase("a")
                    |letra.equalsIgnoreCase("e")
                    |letra.equalsIgnoreCase("i")
                    |letra.equalsIgnoreCase("o")
                    |letra.equalsIgnoreCase("u"))){
                vetor[i] = letra;
                qtdConsoantes++;

            }
        }
        System.out.println("Foram digitadas " + qtdConsoantes + " consoantes.");
        for (String consoante:vetor) {
            if(consoante != null){
                System.out.print(consoante + ", ");
            }
        }
    }

}
