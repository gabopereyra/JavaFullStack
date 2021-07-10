/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen 
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se 
guardará el país en el conjunto y después se le preguntará al usuario si quiere 
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países 
guardados en el conjunto. 
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto 
recordar como se ordena un conjunto. 
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un 
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el 
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra 
en el conjunto se le informará al usuario. 
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesService {

    HashSet<String> paises = new HashSet();
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void ejecutar() {
        boolean ans = true;
        while (ans) {
            System.out.println("Ingrese el nombre del pais a agregar a la lista:");
            paises.add(read.next());
            ans = question();
        }

        showAll(); //Mostrar todos los paises

        orden(); //Mostrar todos los paises ordenados alfabeticamente

        eliminar(); //Se elimina el pais que indique el usuario

        System.out.println("\n----------------------------------\nFIN DEL PROGRAMA\n----------------------------------");
    }

    //Metodo pregunta
    private boolean question() {
        System.out.println("\n¿Desea agregar un nuevo pais? (S/N)");
        String ans = read.next().toUpperCase();
        while (!ans.equals("S") && !ans.equals("N")) {
            System.out.println("El valor indicado es incorrecto, intente nuevamente:");
            ans = read.next().toUpperCase();
        }
        return ans.equals("S");
    } //Fin metodo pregunta

    //Mostrar todo
    private void showAll() {
        System.out.println("\n----------------------------------");
        System.out.println("Los paises que se encuentran en la lista son los siguientes:");
        paises.forEach((pais) -> {
            System.out.println(pais);
        });
        System.out.println("----------------------------------\n");
    }
    //Fin mostrar todo

    //Ordenar alfabeticamente
    private void orden() {
        System.out.println("\n----------------------------------");
        ArrayList<String> ordenAlfabetico = new ArrayList(paises);
        Collections.sort(ordenAlfabetico);

        System.out.println("En orden alfabetico son los siguientes:");
        ordenAlfabetico.forEach((pais) -> {
            System.out.println(pais);
        }
        );
        System.out.println("----------------------------------\n");
    }
    //Fin ordenar alfabeticamente

    //Metodo para eliminar
    private void eliminar() {
        System.out.println("\n----------------------------------");
        System.out.println("Ingrese el nombre del pais a eliminar de la lista:");
        String nombre = read.next();

        Iterator iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(nombre)) {
                iterator.remove();
                System.out.println("Se ha eliminado el pais del listado.\nEl listado ha quedado de la siguiente manera:");
                orden();
                return;
            }
        }
        System.out.println("No se ha encontado el pais indicado.");
        System.out.println("----------------------------------\n");
    }

//Fin metodo eliminar
}
