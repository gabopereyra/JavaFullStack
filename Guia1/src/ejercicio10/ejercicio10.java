package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un texto, si es de 8 caracteres, se devolverá VERDADERO, caso contrario FALSO");
        String phrase = read.next();
        int numero = read.nextInt();
        
        System.out.println(((Object)phrase).getClass().getSimpleName());
        
        System.out.println(((Object)numero).getClass().getSimpleName());
        
        
        /*if(phrase.length()==8){
            System.out.println("VERDADERO");
        }else{          
            System.out.println("FALSO");
        }*/
    }
}
