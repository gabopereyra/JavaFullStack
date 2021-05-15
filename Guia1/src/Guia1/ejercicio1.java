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
