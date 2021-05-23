/*
. Se dispone de un conjunto de N familias,   
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de 
hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package extra13;

import java.util.Scanner;

public class Extra13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int quantityFamilies;
        int quantitySons;
        int age;
        double sumAge;

        System.out.println("Indique la cantidad de familias:");
        quantityFamilies = read.nextInt();

        while (quantityFamilies < 1) {
            System.out.println("El número ingresado es incorrecto, intente nuevamente:");
            quantityFamilies = read.nextInt();
        }

        for (int i = 0; i < quantityFamilies; i++) {
            System.out.println("¿Cuantos hijos posee la familia? ("+(1+i)+"º familia)");
            quantitySons = read.nextInt();

            while (quantitySons < 0) {
                System.out.println("El número ingresado es incorrecto, intente nuevamente:");
                quantityFamilies = read.nextInt();
            }
            sumAge=0;
            for (int j = 0; j < quantitySons; j++) {
                System.out.println("Indique la edad del " + (1+j) + "º hijo/a:");
                age = read.nextInt();
                sumAge += age;
            }

            System.out.println("El promedio de edad es: "+(sumAge/quantitySons)+" años");
        } //FIn for para datos hijos
    } // Fin MAIN
} //Fin public class
