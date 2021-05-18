package Guia1;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        
        System.out.println("Hola Mundo, soy "+nombre+"!");
    }
}

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma*/