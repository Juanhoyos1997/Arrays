package com.example.ejercicios;

public class matriz {
    public static void main(String[] args) {
        long  matriz [][]={
                {4,7,-5,4,9},
                {0,3,-2,6,-2},
                {1,2,4,1,1},
                {6,1,0,3,-4}
        };
        long suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j) {
                    suma += matriz[i][j];
                }
            }
        }

        System.out.println("La suma de todos los elementos de la matriz excepto su diagonal principal es: " + suma);
    }
}
