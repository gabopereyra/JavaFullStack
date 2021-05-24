/*
Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
 */
package extra23;
import java.util.Scanner;
public class Extra23 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int quantity;
        System.out.println("Indique cuantos elementos de la serie desea ver:");
        quantity = read.nextInt();
        if(quantity <= 1){
            System.out.println("La serie es la siguiente: \n1");
        }else{
            doFibonacci(quantity);
        }
    } //End Main

    private static void doFibonacci(int quantity) {
        int auxUno=0;
        int auxDos=1;
        System.out.print("1 ");
        for (int i = 1; i < quantity; i++) {
            int serie = auxUno + auxDos;
            System.out.print(serie+" ");
            auxUno = auxDos;
            auxDos = serie;
        }
        System.out.println("");
    } //End Fibonacci 
    
} //End Public Class
