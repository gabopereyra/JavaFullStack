/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
tamaño N, con los valores ingresados por el usuario
 */
package extra17;

import java.util.Scanner;

public class Extra17 {

    public static void main(String[] args) {
        showSum();
    }

    private static void showSum() {
        int sum = 0;

        for (int i : createVector()) {
            sum += i;
        } //For each sintaxis

        System.out.println("");

        System.out.println("La sumatoria de los elementos es: " + sum);
    }

    private static int[] createVector() {
        Scanner read = new Scanner(System.in);
        int vector[];
        int dimension;
        
        System.out.println("Indique la cantidad de elementos a cargar");
        dimension = read.nextInt();
        
        while (dimension < 1) {
            System.out.println("Valor inválido, intente nuevamente");
            dimension = read.nextInt();
        }
        
        vector = new int[dimension];
        
        for (int i = 0; i < dimension; i++) {
            System.out.println("Indique el valor para la posición " + i);
            vector[i] = read.nextInt();
        }
        
        return vector;
    }

}
