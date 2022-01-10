package com.company;
/*
Crie um vetor de 6 numeros inteiros e
mostre-os na ordem inversa.
*/
public class OrdemInversa {
    int vet[] = {1, 2, 3, 4, 5, 6};
    int aux[] = new int[6];
    public void vetor(){

        System.out.println("Ordem padrão:");
        for(int i = 0; i < vet.length; i++){

            System.out.println("vet[" + i + "] = " + vet[i]);
            aux[aux.length-i-1] = vet[i];
            //System.out.println("aux["+(aux.length-i-1+"] = " + aux[aux.length-i-1] ));

        }
        System.out.println();
        System.out.println("Ordem inversa");
        vet=aux;
        for(int i = 0; i<vet.length;i++){

            System.out.println("vet[" + i + "] = " + vet[i]);
        }
    }

    public void vetor(int[]vetor){

        int aux[] = new int[vetor.length];

        System.out.println("Ordem padrão:");
        for(int i = 0; i < vetor.length; i++){

            System.out.println("vet[" + i + "] = " + vetor[i]);
            aux[aux.length-i-1] = vetor[i];
            //System.out.println("aux["+(aux.length-i-1+"] = " + aux[aux.length-i-1] ));

        }
        System.out.println();
        System.out.println("Ordem inversa");
        vetor=aux;
        for(int i = 0; i<vetor.length;i++){

            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }

    }
}
