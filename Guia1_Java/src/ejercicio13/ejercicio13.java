/*
. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
 
        System.out.println("Ingrese una nota");
        int num = read.nextInt();
        while(num<=0 || num>=10){
            System.out.println("El numero ingresado es inválido, intente nuevamente");
            num = read.nextInt();
        }
        System.out.println("La nota ingresada es: "+num);
    }
    
}
