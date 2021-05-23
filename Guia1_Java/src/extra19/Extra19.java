/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
por parámetro. Después haremos otra función o procedimiento que imprima el vector
 */
package extra19;

import java.util.Scanner;

public class Extra19 {

    public static void main(String[] args) {
        doAndShowVector();
    }

    private static void doAndShowVector() {
        Scanner read = new Scanner(System.in);
        int[] vector;
        int dimension;

        System.out.println("Indique la dimensión que tendrá el vector aleatorio");
        dimension = read.nextInt();
        while (dimension < 1) {
            System.out.println("El valor ingresado es inválido, por favor intente nuevamente");
            dimension = read.nextInt();
        }
        vector = new int[dimension];
        create(vector, dimension);
        show(vector, dimension);
    }

    private static int[] create(int[] vector, int dimension) {
        for (int i = 0; i < dimension; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    } //End create vector

    private static void show(int[] vector, int dimension) {
        System.out.println("El vector generado es: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    } //End Show Vector

}
