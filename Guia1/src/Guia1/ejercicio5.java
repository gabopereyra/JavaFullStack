package Guia1;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en ºC:");
        int temperature = leer.nextInt();
        int fahrenheit = 32 + ((9*temperature)/5);
                
        System.out.println("La temperatura ingresada en ºC fue: "+temperature+"ºC");
        
        System.out.println("El equivalente en ºF es: "+fahrenheit+"ºF");
        
    }
}


//Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).