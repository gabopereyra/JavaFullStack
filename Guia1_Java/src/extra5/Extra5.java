/*
Una obra social tiene tres clases de socios: 
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos. 
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A. 
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos. 

Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio.
 */
package extra5;

import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Indique el costo del tratamiento");
        int cost = read.nextInt();
        System.out.println("Indique el tipo de socio (A/B/C)");
        String type = read.next().toLowerCase();
        while (!type.equals("a") && !type.equals("b") && !type.equals("c")) {
            System.out.println("El tipo de socio es incorrecto, intente nuevamente");
            type = read.next().toLowerCase();
        }
        switch (type) {
            case "a":
                System.out.println("El socio tiene un 50% de descuento");
                System.out.println("El monto a pagar es: $" + cost * 0.5);
                System.out.println("(costo original: $" + cost + ")");
                break;
            case "b":
                System.out.println("El socio tiene un 35% de descuento");
                System.out.println("El monto a pagar es: $" + cost * 0.65);
                System.out.println("(costo original: $" + cost + ")");
                break;
            default:
                System.out.println("El socio no posee descuentos");
                System.out.println("El monto a pagar es: $" + cost);
                break;
        }

    }

}
