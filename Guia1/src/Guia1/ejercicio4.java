package Guia1;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa la frase a transformar:");
        String frase = leer.next();
        
        System.out.println("La frase convertida a minusculas es:");
        
        System.out.println(frase.toLowerCase());
        
        System.out.println("La frase convertida a mayusculas es:");
        
        System.out.println(frase.toUpperCase());
    }
}

/*. Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/