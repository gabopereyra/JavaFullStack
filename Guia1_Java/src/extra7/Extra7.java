/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package extra7;

import java.util.Scanner;

public class Extra7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int quantity;
        int min;
        int max;
        int[] data;
        int sum;
        System.out.println("Indique la cantidad de datos a ingresar");
        quantity = read.nextInt();
        while (quantity <= 0) {
            System.out.println("El valor ingresado es incorrecto\nPor favor intente nuevamente");
            quantity = read.nextInt();
        }
        data = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.println("Ingrese el valor " + (i + 1));
            data[i] = read.nextInt();
        }
        min = data[0];
        max = data[0];
        sum = data[0];
        for (int i = 1; i < quantity; i++) {
            if (data[i] < min) {
                min = data[i];
            } else if (data[i] > max) {
                max = data[i];
            }
            sum +=data[i];
        }
        System.out.println("El promedio de los numeros es: "+(sum/quantity)+"\nDonde el minimo es: "+min+"\ny el máximo es: "+max);
    }

}
