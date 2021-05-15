/*
 Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package ejercicio21;

import java.util.Scanner;

public class ejercicio21 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el monto a transformar (expresado en Euros)");
        int value = read.nextInt();

        System.out.println("Ingrese la moneda a la cual desea convertirlo");
        System.out.println("dolar/yen/libra");
        String currency = read.next();

        while (!currency.equals("dolar") && !currency.equals("yen") && !currency.equals("libra")) {
            System.out.println("La moneda ingresada es incorrecta, intente nuevamente");
            System.out.println("dolar/yen/libra");
            currency = read.next();
        }
        conversion(value, currency);
    }

    public static void conversion(int amount, String currency) {
        switch (currency) {
            case "libra":
                System.out.println("El tipo de cambio es: 0.86 libras es un 1 €");
                System.out.println("El monto en libras es: "+(0.86*amount));
                break;
            case "dolar":
                System.out.println("El tipo de cambio es: 1.28611 $ es un 1 €");
                System.out.println("El monto en dolares es: "+(1.28611*amount));
                break;
            case "yen":
                System.out.println("El tipo de cambio es: 129.852 yenes es un 1 €");
                System.out.println("El monto en yenes es: "+(129.852*amount));
                break;
        }
    }

}
