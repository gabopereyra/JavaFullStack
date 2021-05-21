/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano
 */
package extra4;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero comprendido entre 1 y 10");
        int num = read.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("El número ingresado es incorrecto, intente nuevamente");
            num = read.nextInt();
        }
        switch (num) {
            case 1:
                System.out.println("El equivalente es romano es: I");
                break;
            case 2:
                System.out.println("El equivalente es romano es: II");
                break;
            case 3:
                System.out.println("El equivalente es romano es: III");
                break;
            case 4:
                System.out.println("El equivalente es romano es: IV");
                break;
            case 5:
                System.out.println("El equivalente es romano es: V");
                break;
            case 6:
                System.out.println("El equivalente es romano es: VI");
                break;
            case 7:
                System.out.println("El equivalente es romano es: VII");
                break;
            case 8:
                System.out.println("El equivalente es romano es: VIII");
                break;
            case 9:
                System.out.println("El equivalente es romano es: IX");
                break;
            default:
                System.out.println("El equivalente es romano es: X");
                break;
        } //END SWITCH
    } //END MAIN
} //END CLASS
