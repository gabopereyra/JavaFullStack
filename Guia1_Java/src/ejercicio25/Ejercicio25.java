/*
. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la 
muestre ordenada por sus columnas. */
package ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               matriz[i][j] = (int) (Math.random()*10);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
