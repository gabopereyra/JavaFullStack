/*
. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una matriz A es anti simétrica 
cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int row;
        int[][] matriz;
        int[][] matrizTraspuesta;

        System.out.println("Indique la cantidad de filas que tendrá la matriz");
        row = read.nextInt();
        matriz = new int[row][row];
        matrizTraspuesta = new int[row][row];

        create(matriz, row, read);
        createTraspuesta(matriz, matrizTraspuesta, row);
        System.out.println("La matriz original es:");
        show(matriz, row);
        System.out.println("");
        System.out.println("La traspuesta con signo cambiado es: ");
        show(matrizTraspuesta, row);
        System.out.println("");
        if (check(matriz, matrizTraspuesta, row)) {
            System.out.println("Es antisimetrica");
        } else {
            System.out.println("NO es antisimetrica");
        };
    }

    public static void create(int[][] matriz, int row, Scanner read) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    System.out.println("Indique el valor para la posición " + i + ", " + j);
                    matriz[i][j] = read.nextInt();
                }
            }
        }
    }

    public static void show(int[][] matriz, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public static void createTraspuesta(int[][] matriz, int[][] matrizTraspuesta, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrizTraspuesta[j][i] = matriz[i][j] * -1;
            }
        }
    }

    public static boolean check(int[][] matriz, int[][] matrizTraspuesta, int row) {
        boolean value = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i != j) {
                    if (matriz[i][j] != matrizTraspuesta[i][j]) {
                        value = false;
                    }
                }
            }
        }
        return value;
    }
}
