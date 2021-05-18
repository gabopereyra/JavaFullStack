/*
. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer numero (entre 1 y 20 inclusive)");
        int num = read.nextInt();
        while (num > 20 || num < 1) {
            System.out.println("El número ingresado es incorrecto, intente nuevamente");
            num = read.nextInt();
        }
        System.out.println("Ingrese el segundo numero (entre 1 y 20 inclusive)");
        int num_dos = read.nextInt();
        while (num_dos > 20 || num_dos < 1) {
            System.out.println("El número ingresado es incorrecto, intente nuevamente");
            num_dos = read.nextInt();
        }
        System.out.println("Ingrese el tercer numero (entre 1 y 20 inclusive)");
        int num_tres = read.nextInt();
        while (num_tres > 20 || num_tres < 1) {
            System.out.println("El número ingresado es incorrecto, intente nuevamente");
            num_tres = read.nextInt();
        }
        System.out.println("Ingrese el segundo numero (entre 1 y 20 inclusive)");
        int num_cuatro = read.nextInt();
        while (num_cuatro > 20 || num_cuatro < 1) {
            System.out.println("El número ingresado es incorrecto, intente nuevamente");
            num_cuatro = read.nextInt();
        }

        System.out.print(num + " ");
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num_dos + " ");
        for (int i = 0; i < num_dos; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num_tres + " ");
        for (int i = 0; i < num_tres; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num_cuatro + " ");
        for (int i = 0; i < num_cuatro; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
