/*
Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea. Solicitar la altura de 
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123
 */
package extra12;
import java.util.Scanner;
public class Extra12 {

    public static void main(String[] args) {
        
        doStairs();
    }

    private static void doStairs() {
        int num = number();
        System.out.println("el numero es: "+num);
        int aux=1;
        while(aux<=num){
            for (int i = 1; i <= aux; i++) {
                System.out.print(i);
            }
            aux++;
            System.out.println("");
        }
    }

    private static int number() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo:");
        int number = read.nextInt();
        while(number<1){
            System.out.println("El numero ingresado es inválido, por favor intente nuevamente");
            number = read.nextInt();
        }
        return number;
    }
    
}
