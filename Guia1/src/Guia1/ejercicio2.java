
package Guia1;

import java.util.Scanner;

public class ejercicio2 {
    
public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero");
        int numUno = leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numDos = leer.nextInt();
        int resultado = numUno+numDos;
        System.out.println("El resultado de la suma es: "+resultado);
    }
}

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.*/