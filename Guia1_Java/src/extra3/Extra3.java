/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la 
clase String. 
 */
package extra3;

import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una letra cualquiera");
        String letter = read.next().toLowerCase();

        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("b")) {
            System.out.println("Es vocal");
        } else {
            System.out.println("NO es vocal");
        }

    }

}
