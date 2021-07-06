package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerroService {

    private final Scanner read = new Scanner(System.in);

    private final ArrayList <Perro> razas = new ArrayList();

    public void crear() {
        boolean ans = true;
        while (ans) {
            nuevo();
            ans = question();
        }
        mostrar();
        eliminar();
    } //Fin metodo creacion

    private void nuevo() {
        Perro perro = new Perro();
        System.out.println("Ingrese una raza:");
        perro.setRaza(read.next());
        addRaza(perro);
    } //Fin metodo nuevo

    private boolean question() {
        System.out.println("\nDesea agregar una nueva raza? (S/N)");
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
    } //Fin metodo pregunta

    private void addRaza(Perro perro) {
        razas.add(perro);
    }//Fin metodo añadir

    private void mostrar() {
        System.out.println("\nLas razas guardadas son las siguientes:");
        for (Perro raza : razas) {
            System.out.println(raza.getRaza());
        }
    } //Fin metodo mostrar

    private void eliminar() {
        Iterator <Perro> iterator = razas.iterator();
        System.out.println("\nIndique una raza (la misma se eliminará del arreglo)");
        String eliminar = read.next();

        while (iterator.hasNext()) {
            if (iterator.next().getRaza().equals(eliminar)) {
                iterator.remove();
            }else{
                System.out.println("La raza indicada no fue encontrada.");
            }
        }
        mostrar();

    } //Fin metodo eliminar

}
