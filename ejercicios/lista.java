package com.example.ejercicios;

public class lista {
    public static void main(String[] args) {
        int lista[][] = {
                {4, 7, 1, 3, 5},
                {2, 0, 6, 9, 7},
                {3, 1, 2, 6, 4}
        };

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(lista[j][i]);
            }
            System.out.println("");
        }
    }
}