package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase:");
       String frase = read.next();
       if(frase.equals("eureka")){
           System.out.println("EUREKA!!");
       } else{
           System.out.println("Lo sentimos... ='/");
       }
    }
    
}
