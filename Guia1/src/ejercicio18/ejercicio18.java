/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. 
 */
package ejercicio18;

public class ejercicio18 {

    public static void main(String[] args) {
        System.out.println("Se deberia imprimir");
        for (int i = 0; i < 10; i++) {
            for (int x = 0; x < 10; x++) {
                for (int j = 0; j < 10; j++) {
                    String a = String.valueOf(i);
                    String b = String.valueOf(x);
                    String c = String.valueOf(j);
                    if (a.equals("3")) {
                        a = "E";
                    }
                    if (b.equals("3")) {
                        b = "E";
                    }
                    if (c.equals("3")) {
                        c = "E";
                    }
                    System.out.println(a+"-"+b+"-"+c);
                }
            }
        }
    }
}
