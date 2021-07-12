/*

Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios. 
 */
package extra2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CantanteFamosoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    List<CantanteFamoso> lista = new ArrayList();

    //Crear cantante
    public void crear() {
        System.out.println("---------------------");
        System.out.println("Ingrese el nombre del artista:");
        String nombre = read.next();
        System.out.println("Ingrese su disco mas vendido:");
        String vendido = read.next();
        CantanteFamoso cantante = new CantanteFamoso(nombre, vendido);
        lista.add(cantante);
        System.out.println("Los datos fueron cargados con exito.");
        System.out.println("---------------------");
    } //Fin crear cantante

    //MENU (ejecuta)
    public void menu() {
        String ans;
        do {
            ans = opciones();
            switch (ans) {
                case "A":
                    crear();
                    break;
                case "B":
                    showAll();
                    break;
                case "C":
                    delete();
                    break;
                default:
                    break;
            }
        } while (!ans.equals("D"));
        System.out.println("--EL PROGRAMA HA FINALIZADO--");
    } //Fin menu

    //MENU OPCIONES
    private String opciones() {
        System.out.println("---------------------");
        System.out.println("Indique que acción desea realizar:"
                + "\nA) Agregar nuevo cantante."
                + "\nB) Mostrar todo."
                + "\nC) Eliminar un cantante."
                + "\nD) SALIR.");
        String res = read.next().toUpperCase();
        while (!res.equals("A") && !res.equals("C") && !res.equals("B") && !res.equals("D")) {
            System.out.println("La opción ingresada es inválida, por favor intente nuevamente:");
            res = read.next().toUpperCase();
        }
        System.out.println("---------------------");
        return res;
    } //MENU DE OPCIONES

    //MOSTRAR TODO
    private void showAll() {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("---------------------");
            System.out.println("El listado actual es el siguiente:");
            for (CantanteFamoso cantanteFamoso : lista) {
                System.out.println("NOMBRE ARTISTA: " + cantanteFamoso.getNombre() + ", NOMBRE DISCO + VENDIDO: " + cantanteFamoso.getDisco());
            }
            System.out.println("---------------------");
        }
    } //FIN MOSTRAR TODO

    //DELETE
    private void delete() {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            Iterator<CantanteFamoso> it = lista.iterator();
            System.out.println("Ingrese el nombre del artista que desea eliminar: ");
            String nombre = read.next();
            int sum = 0;
            while (it.hasNext()) {
                if (it.next().getNombre().equals(nombre)) {
                    it.remove();
                    System.out.println("El artista se ha removido con éxito.");
                    sum++;
                }
            }
            if(sum==0){
                System.out.println("NO SE HA ENCONTRADO EL ARTISTA.");
            }
        }
    }//FIN DELETE
}
