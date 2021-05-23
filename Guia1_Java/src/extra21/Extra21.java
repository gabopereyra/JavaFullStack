/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios 
y muestre la suma de sus elementos
 */
package extra21;

import java.util.Scanner;

public class Extra21 {

    public static void main(String[] args) {
        System.out.println("La sumatoria de los elementos de la matriz aleatoria es igual a "+showSum());
    } //End main

    private static int showSum() {
        int sum = 0;
        int[][] matriz = createMatriz();
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sum += matriz[i][j];
            }
        }
        
        return sum;
    } //End Show sum

    private static int[][] createMatriz() {
        Scanner read = new Scanner(System.in);
        
        int [] [] matriz;
        int row;
        int col;
        
        System.out.println("Indique las filas que tendrá la matriz");
        row = read.nextInt();
        while(row<1){
            System.out.println("El valor ingresado es inválido, intente nuevamente");
            row = read.nextInt();
        }
        
        System.out.println("Indique las columnas que tendrá la matriz");
        col = read.nextInt();
                while(col<1){
            System.out.println("El valor ingresado es inválido, intente nuevamente");
            col = read.nextInt();
        }
         
        matriz = new int [row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j]=(int) (Math.random() * 10);
            }
        }
        
        return matriz;
    }//End Create matriz

}//End public class
