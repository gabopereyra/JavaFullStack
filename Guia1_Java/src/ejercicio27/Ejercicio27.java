/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado 
por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //matriz será de 3x3
        int [][] matriz = new int[3][3];
        create(matriz, 3, read);
        result(matriz,3);
        
       if (result(matriz, 3)) {
            System.out.println("ES MAGICA");
        } else {
            System.out.println("NO ES MAGICA");
        };
    }

    private static void create(int[][] matriz, int size, Scanner read) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Indique valor para la posición "+i+", "+j);
                matriz[i][j]=read.nextInt();
            }
        }
    }

    private static boolean result(int[][] matriz, int size) {
        int control = 15; //value of sum for 3x3 matriz
        boolean value = false;
        if(row(matriz, size, control) && col(matriz, size, control) && diag(matriz, size, control)){
            value = true;
        }
        return value;
    }

    private static boolean row(int[][] matriz, int size, int control) {
        boolean value = true;
        int i=0;
        while(value && i<size){
            int suma=0;
            for (int j = 0; j < size; j++) {
                suma += matriz[i][j];
            }
            i++;
            if(suma != control){
                value = false;
            }
        }
        return value;
    } // End row
        private static boolean col(int[][] matriz, int size, int control) {
        boolean value = true;
        int j=0;
        while(value && j<size){
            int suma=0;
            for (int i = 0; i < size; i++) {
                suma += matriz[i][j];
            }
            j++;
            if(suma != control){
                value = false;
            }
        }
        return value;
    }  // End column
       private static boolean diag(int[][] matriz, int size, int control) {
        boolean value = true;
        int suma=0;
        //principal
        int j=0;
           for (int i = 0; i < size; i++) {
               suma += matriz[i][j];
               j++;
           }
           if (suma != control){
               value = false;
           } else {
               //secondary
               suma = 0;
               j = 0;
               for (int i = (size - 1); i>-1; i--) {
                   suma += matriz[i][j];
                   j++;
               }
               if (suma != control) {
                   value = false;
               } 
           }
        return value;
    }  // End column
}
