/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ejercicio15 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer numero ENTERO POSITIVO");
        int numUno = read.nextInt();
        System.out.println("Ingrese el segundo numero ENTERO POSITIVO");
        int numDos = read.nextInt();
        int rta;
        do {
            System.out.println("Indique que tipo de operación desea realizar");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            rta = read.nextInt();
            switch (rta) {
                case 1:
                    System.out.println("La suma es: " + (numUno + numDos));
                    break;
                case 2:
                    System.out.println("La resta es: " + (numUno - numDos));
                    break;
                case 3:
                    System.out.println("El producto es: " + (numUno * numDos));
                    break;
                case 4:
                    System.out.println("La división es: " + (numUno / numDos));
                    break;
                case 5:
                    System.out.println("¿esta seguro que desea abandonar el programa? (S/N)");
                    String ask = read.next();
                    if (ask.equals("N")){
                        rta = 0;
                    }
                    break;
                    
                default:
                    System.out.println("La opción ingresada es incorrecta, intente nuevamente");
                    break;
            }
        } while (rta != 5);
        System.out.println("Se ha finalizado el programa");
    }
}
