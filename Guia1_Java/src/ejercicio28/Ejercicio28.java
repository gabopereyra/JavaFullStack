/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matrizP de 3x3, se solicita 
escribir un programa en el cual se compruebe si la matriz P está contenida dentro de la matriz M.
Para ello se debe verificar si entre todas lassubmatrices de 3x3 que se pueden formar en la 
matriz M, desplazándose por filas o columnas, existe al menos una que coincida con la 
matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P
 */
package ejercicio28;

public class Ejercicio28 {

    public static void main(String[] args) {
        System.out.println("Para simplificar el ejercicio, el mismo va a trabajar con matrices de numeros aleatorios");
        int[][] matUno = new int[10][10]; //matriz de 10*10
        int[][] matDos = new int[3][3]; //matriz de 3*3
        //Vamos a crear la primer matriz
        create(matUno, 10);
        //Vamos a crear la segunda matriz
        create(matDos, 3);
        //imprimir
        System.out.println("La matriz de 10x10 es:");
        imprimir(matUno, 10);
        System.out.println("\nLa matriz de 3x3 es:");
        imprimir(matDos, 3);
        //Subproceso de chequear
        System.out.println("\nA continuación se muestra el resultado del chequeo");
        check(matUno, matDos, 10);
    }

    private static void create(int[][] matriz, int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * (10 - 0 + 1) + 0);
            }
        }
    } //Fin función para llenar las matrices

    private static void check(int[][] matUno, int[][] matDos, int dimUno) {
        boolean control = false;
        for (int i = 0; i < (dimUno - 2); i++) {
            for (int j = 0; j < (dimUno - 2); j++) {
                if (matUno[i][j] == matDos[0][0]) {
                    control = true;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matUno[i+k][j+l] != matDos[k][l]) {
                                control = false;
                            }
                        }
                    }
                    if (control) {
                        System.out.println("La submatriz de 3x3 se encuentra contenida a partir de la posición " + i + ", " + j);
                    }
                }
            }
        } //Recorro hasta 3 posiciones antes dado que más allá de eso no puedo tener una matriz de 3x3
        if (!control) {
            System.out.println("La submatriz no fue hallada");
        }
    } //Fin funcion de chequeo

    private static void imprimir(int[][] matriz, int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("|" + matriz[i][j] + "| ");
            }
            System.out.println("");
        }
    } //Fin subproceso para imprimir.
}
