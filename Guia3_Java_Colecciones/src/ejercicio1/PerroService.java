/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroService {

    private final Scanner read = new Scanner(System.in);

    private final ArrayList<Perro> razas = new ArrayList();

    public void crear() {
        boolean ans = true;
        while (ans) {
            nuevo();
            ans = question();
        }
        mostrar();
    }

    private void nuevo(){
            Perro perro = new Perro();
            System.out.println("Ingrese una raza:");
            perro.setRaza(read.next());
            addRaza(perro);   
    }
    
    private boolean question() {
        System.out.println("Desea agregar una nueva raza? (S/N)");
        String ans = read.next().toUpperCase();
        while (!ans.equals("S") && !ans.equals("N")) {
            System.out.println("El valor indicado es incorrecto, intente nuevamente:");
            ans = read.next().toUpperCase();
        }
        if (ans.equals("S")) {
            return true;
        } else {
            return false;
        }
    }

    private void addRaza(Perro perro) {
        razas.add(perro);
    }

    private void mostrar() {
        System.out.println("Las razas guardadas son las siguientes:");
        for (Perro raza : razas) {
            System.out.println(raza.getRaza());
        }
    }
}
