/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro 
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo
 */
package extra16;

import java.util.Scanner;

public class Extra16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero entero positivo:");
        number = read.nextInt();
        while (number < 1) {
            System.out.println("El valor ingresado es incorrecto, por favor intente nuevamente");
            number = read.nextInt();
        }
        System.out.println(isPrime(number));
    }//End Main

    private static boolean isPrime(int number) {
        boolean answer=false;
        int count=0;
        for (int i = 1; i <= number; i++) {
            if(number%i == 0){
                count++;
            }
        }
        if (count==2) {
            answer=true;
        }
        return answer;
    } //End isPrime

}//End Public Class
