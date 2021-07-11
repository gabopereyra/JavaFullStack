/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los 
distintos productos que venderemos y el precio que tendrán. Además, se necesita 
que la aplicación cuente con las funciones básicas. 
Estas las realizaremos en el main. Como, introducir un elemento, modificar su 
precio, eliminar un producto y mostrar los productos que tenemos con su precio 
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor 
el precio. Realizar un menú para lograr todas las acciones previamente 
mencionadas.
 */
package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductosService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> listado = new HashMap();

    public void ejecutar() {
        String ans = "";
        do {
            ans = menu();
            switch (ans) {
                case "A":
                    add();
                    break;
                case "B":
                    update();
                    break;
                case "C":
                    delete();
                    break;
                case "D":
                    showAll();
                    break;
            }
        } while (!ans.equals("E"));
        System.out.println("El programa se ha finalizado");
    } //Fin Metodo ejecutar.

    //Menu
    private String menu() {
        System.out.println("--------------------------------------------\n"
                + "Indique la acción que desea realizar:\n"
                + "A) Introducir nuevo producto.\n"
                + "B) Modificar un precio de un producto.\n"
                + "C) Eliminar un producto.\n"
                + "D) Mostrar los productos.\n"
                + "E) Finalizar programa.\n"
                + "--------------------------------------------");
        String res = read.next().toUpperCase();
        while (!res.equals("A") && !res.equals("B") && !res.equals("C") && !res.equals("D") && !res.equals("E")) {
            System.out.println("La opción ingresada es incorrecta, por favor intente nuevamente: ");
            res = read.next();
        }
        return res;
    }
    //Fin metodo menu

    //Metodo crear entrada
    private void add() {
        System.out.println("--------------------------------------------\nIngrese el nombre del producto:");
        String nombre = read.next();
        System.out.println("Ingrese el precio del producto:");
        Double precio = read.nextDouble();
        listado.put(nombre, precio);
        System.out.println("El producto fue agregado con éxito\n--------------------------------------------");
    } //Fin adicion

    private void update() {
        if (listado.isEmpty()) {
            System.out.println("--------------------------------------------\nEl listado esta vacío");
            return;
        }
        System.out.println("--------------------------------------------\nIngrese el nombre del producto a buscar: ");
        String nombre = read.next();
        while (!listado.containsKey(nombre)) {
            System.out.println("El producto no se encuentra en el listado, por favor intente nuevamente:");
            nombre = read.next();
        }
        System.out.println("Ingrese el nuevo precio del producto:");
        Double precio = read.nextDouble();
        listado.put(nombre, precio);
        System.out.println("El producto fue actualizado con éxito\n--------------------------------------------");
    } //Fin update

    private void delete() {
        if (listado.isEmpty()) {
            System.out.println("--------------------------------------------\nEl listado esta vacío");
            return;
        }
        System.out.println("--------------------------------------------\nIngrese el nombre del producto a buscar: ");
        String nombre = read.next();
        while (!listado.containsKey(nombre)) {
            System.out.println("El producto no se encuentra en el listado, por favor intente nuevamente:");
            nombre = read.next();
        }
        listado.remove(nombre);
        System.out.println("El producto fue eliminado con éxito\n--------------------------------------------");
        
    } //Fin delete

    private void showAll() {
        if (listado.isEmpty()) {
            System.out.println("--------------------------------------------\nEl listado esta vacío");
            return;
        }
        System.out.println("--------------------------------------------\nLos productos listados son los siguientes:");
//        for (Map.Entry<String, Double> producto : listado.entrySet()) {
//            System.out.println("Producto: " + producto.getKey() + ", Precio: $" + producto.getValue());
//        }
        listado.entrySet().forEach((producto) -> {
            System.out.println("PRODUCTO: " + producto.getKey() + ", PRECIO: $" + producto.getValue());
        });
        System.out.println("--------------------------------------------\n");
    } //Fin ShowAll
}
