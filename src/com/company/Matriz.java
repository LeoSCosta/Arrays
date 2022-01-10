package com.company;

import java.util.Random;

/*
Gere e imprima uma matriz  4x4 com valores aleatorios entre 0-9
*/
public class Matriz {

    int[][] matriz = new int[4][5];
    Random random = new Random();

    public void imprimir(){

        System.out.println("Matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
