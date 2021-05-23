/*
. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada 
operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package extra14;

import java.util.Scanner;

public class Extra14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double numUno;
        double numDos;
        System.out.println("A continuación cargue el primer valor:");
        numUno = read.nextInt();
        System.out.println("A continuación cargue el segundo valor:");
        numDos = read.nextInt();

        switch (chooseOperation(read)) {
            case "s":
                System.out.println("La suma de los elementos es: " + sumar(numUno, numDos));
                break;

            case "r":
                System.out.println("La resta de los elementos es: " + restar(numUno, numDos));
                break;

            case "p":
                System.out.println("La suma de los elementos es: " + multiplicar(numUno, numDos));
                break;

            default:
                if (numDos == 0) {
                    System.out.println("El divisor es igual a 0, no está definida la división.");
                } else {
                    System.out.println("La suma de los elementos es: " + dividir(numUno, numDos));
                }
                break;
        }
    }

    private static String chooseOperation(Scanner read) {
        System.out.println("Indique que tipo de operación desea realizar:\n(S): suma\n(R): resta\n(P): producto\n(D): división");
        String operation = read.next().toLowerCase();
        while (operation.equals("s") && operation.equals("r") && operation.equals("p") && operation.equals("d")) {
            System.out.println("La operación ingresada es incorrecta, por favor intente nuevamente:");
            operation = read.next().toLowerCase();
        }
        return operation;
    }

    private static double sumar(double numUno, double numDos) {
        double sum = numUno + numDos;
        return sum;
    }

    private static double restar(double numUno, double numDos) {
        double resta = numUno - numDos;
        return resta;
    }

    private static double multiplicar(double numUno, double numDos) {
        double producto = numUno * numDos;
        return producto;
    }

    private static double dividir(double numUno, double numDos) {
        double division = numUno / numDos;
        return division;
    }

}
