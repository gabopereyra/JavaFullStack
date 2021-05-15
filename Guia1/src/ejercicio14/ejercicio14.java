/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial. 
 */
package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor que va a funcionar de límite");
        int limit = read.nextInt();
        int sum = 0;
        int num;
        System.out.println("El siguiente código se ejecutará hasta que la sumatoria de los números ingresados supere al limite definido");
        do{
            System.out.println("Ingrese un numero cualquiera");
            num = read.nextInt();
            sum = sum+num;
        } while(sum<=limit);
        System.out.println("La suma de los numeros ingresados es: "+sum);
       
    }
    
}
