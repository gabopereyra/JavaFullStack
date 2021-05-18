package Guia1;

import java.util.Scanner;

public class ejercicio6 {
    
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero a trabajar:");
        int num = leer.nextInt();
        int doble = num*2;
        int triple = num*3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble del numero ingresado es: "+doble);
        System.out.println("El triple del numero ingresado es: "+triple);
        System.out.println("La raíz del numero ingresado es: "+raiz);
    }
}
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt()*/