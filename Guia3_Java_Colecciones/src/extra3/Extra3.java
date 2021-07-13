/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
 */
package extra3;

import java.util.HashSet;
import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        LibroService servicio = new LibroService();
        HashSet<Libro> listado = new HashSet();
        String title;

        String ans;
        do {
            ans = servicio.menu();
            switch (ans) {
                case "A":
                    servicio.crear(listado);
                    break;
                case "B":
                    System.out.println("Indique el titulo del libro:");
                    title = read.next();
                    if (servicio.prestar(listado, title)) {
                        System.out.println("Se realizó con éxito.");
                    } else {
                        System.out.println("No pudo realizarse.");
                    }
                    break;
                case "C":
                    System.out.println("Indique el titulo del libro:");
                    title = read.next();
                    if (servicio.devolver(listado, title)) {
                        System.out.println("Se realizó con éxito.");
                    } else {
                        System.out.println("No pudo realizarse.");
                    }
                    break;
            } //fin Switch

        } while (!ans.equals("D"));
        System.out.println("--GRACIAS POR SU VISITA--");
    }

}
