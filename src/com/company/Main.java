package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        Crie um vetor de 6 numeros inteiros e
        mostre-os na ordem inversa.
        */
        OrdemInversa vet = new OrdemInversa();
        vet.vetor(); //Usando vetor dentro prédefinido na classe

        int[] vetor={10,20,30,40,50,60};
        vet.vetor(vetor);//Passando o vetor para o metodo
        int[] vetor7={1,2,3,4,5,6,7};
        vet.vetor(vetor7); // aceita vetores de qualquer tamanho


        /*
        Faça um programa que leia um vetor de 6 caracteres, e
        diga quantas consoantes foram lidas.
        imprima as consoantes
        */
        Consoantes consoantes = new Consoantes();
        consoantes.consoantes();
    }
}
