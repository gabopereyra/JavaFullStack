/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados
 */
package extra11;

import java.util.Scanner;

public class Extra11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = read.nextInt();
        System.out.println("La cantidad de digitos del numero son: "+returnDigits(num));
    }

    private static int returnDigits(int num) {
        int count = 0;
        do{
            num /= 10;
            count++;
        }while(num>=1);
        return count;
    }
}
