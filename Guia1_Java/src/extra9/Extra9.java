/*
Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package extra9;

import java.util.Scanner;

public class Extra9 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int dividendo;
        int divisor;
        int aux;
        int contador = 0;

        System.out.println("Indique el dividendo:");
        dividendo = read.nextInt();

        System.out.println("Indique el divisor:");
        divisor = read.nextInt();
        while (divisor > dividendo) {
            System.out.println("El divisor NO puede ser mayor al dividendo. \n Indique un nuevo valor:");
            divisor = read.nextInt();
        }
        aux = dividendo;

        do {
            aux -= divisor;
            contador++;

        } while (aux >= divisor);
        System.out.println("El cociente es: "+contador+"\nEl resto de la división es: "+aux);
    }
}
