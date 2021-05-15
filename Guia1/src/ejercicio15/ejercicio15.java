/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ejercicio15 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer numero ENTERO POSITIVO");
        int numUno = read.nextInt();
        System.out.println("Ingrese el segundo numero ENTERO POSITIVO");
        int numDos = read.nextInt();
        int rta;
        do {
            System.out.println("Indique que tipo de operación desea realizar");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            rta = read.nextInt();
            switch (rta) {
                case 1:
                    System.out.println("La suma es: " + (numUno + numDos));
                    break;
                case 2:
                    System.out.println("La resta es: " + (numUno - numDos));
                    break;
                case 3:
                    System.out.println("El producto es: " + (numUno * numDos));
                    break;
                case 4:
                    System.out.println("La división es: " + (numUno / numDos));
                    break;
                case 5:
                    System.out.println("¿esta seguro que desea abandonar el programa? (S/N)");
                    String ask = read.next();
                    if (ask.equals("N")){
                        rta = 0;
                    }
                    break;
                    
                default:
                    System.out.println("La opción ingresada es incorrecta, intente nuevamente");
                    break;
            }
        } while (rta != 5);
        System.out.println("Se ha finalizado el programa");
    }
}
