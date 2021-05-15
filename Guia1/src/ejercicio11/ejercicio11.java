
package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase cualquiera");
        String phrase = read.next();
        if (phrase.substring(0, 1).equals("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        System.out.println(phrase.substring(0, 1));
    } 
}

/* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java */