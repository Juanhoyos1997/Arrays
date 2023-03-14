package com.example.ejercicios;

import java.util.Scanner;

public class votos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[][] tablaVotacion = new String[6][4];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0) {
                    System.out.print("Ingrese el nombre del candidato " + (j+1) + ": ");
                    tablaVotacion[i][j] = scanner.next();
                } else {
                    System.out.print("Ingrese el número de votos para el candidato " + tablaVotacion[0][j] + " en el municipioio " + (j+1) + ": ");
                    tablaVotacion[i][j] = scanner.next();
                }
            }
        }


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tablaVotacion[i][j] + "\t");
            }
            System.out.println();
        }

        int tvotos=0;
        int[] totalVotos = new int[4];


        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < 6; i++) {
                totalVotos[j] += Integer.parseInt(tablaVotacion[i][j]);

                tvotos+=Integer.parseInt(tablaVotacion[i][j]);
            }

            System.out.println(tablaVotacion[0][j] + " recibió " + totalVotos[j] );
        }

        System.out.println("los votos en total son "+tvotos);

        int maxVotos = 0;
        int maxVotosIndex = 0;
        int maxVotosIndex2 =0;
        for (int j = 0; j < 4; j++) {
            if (totalVotos[j] > maxVotos) {
                maxVotos = totalVotos[j];
                maxVotosIndex = j;

            }else if((totalVotos[j] >  maxVotosIndex2 && totalVotos[j] < maxVotosIndex)) {
                maxVotosIndex2=j;
            }
        }
        System.out.println("El candidato más votado es " + tablaVotacion[0][maxVotosIndex] + " con " + maxVotos + " votos.");
        System.out.println("");
        System.out.println("");
        if ((tvotos/2)<maxVotos){
            System.out.println("");
            System.out.println("El candidato ganador  es " + tablaVotacion[0][maxVotosIndex] + " con " + maxVotos + " que supera el 50% de los votos.");
        }
        else{


            System.out.println("no hay ganador ");
            System.out.println("");



            int max1 = totalVotos[0];
            int max2 = Integer.MIN_VALUE;

            for (int i = 1; i < totalVotos.length; i++) {
                if  (totalVotos[i] > max1) {
                    max2 = max1;
                    max1 = totalVotos[i];
                } else if (totalVotos[i] > max2 && totalVotos[i] < max1) {
                    max2 = totalVotos[i];
                }
            }
            System.out.println("estos candidatos pasan a 2 ronda");
            System.out.println("El primer candidado con mas votos es   : " + tablaVotacion[0][maxVotosIndex]+ "  con   "+ max1+"votos");
            System.out.println("El segundo candidato con mas votos es   : "+ tablaVotacion[0][maxVotosIndex2]+ "  con   " + max2+"votos");
        }
    }
}
