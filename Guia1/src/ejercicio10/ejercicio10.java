package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un texto, si es de 8 caracteres, se devolverá VERDADERO, caso contrario FALSO");
        String phrase = read.next();
        int numero = read.nextInt();   
        
        if(phrase.length()==8){
            System.out.println("VERDADERO");
        }else{          
            System.out.println("FALSO");
        }
    }
}

/*. Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/