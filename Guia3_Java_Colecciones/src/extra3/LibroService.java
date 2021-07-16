package extra3;

import java.util.HashSet;
import java.util.Scanner;

public class LibroService {

    Scanner read = new Scanner(System.in);

    public String menu() {
        System.out.println("---------------------");
        System.out.println("Indique que acción desea realizar:"
                + "\nA) Agregar nuevo libro."
                + "\nB) Préstamo."
                + "\nC) Devolución."
                + "\nD) SALIR.");
        String res = read.next().toUpperCase();
        while (!res.equals("A") && !res.equals("C") && !res.equals("B") && !res.equals("D")) {
            System.out.println("La opción ingresada es inválida, por favor intente nuevamente:");
            res = read.next().toUpperCase();
        }
        System.out.println("---------------------");
        return res;
    }

    public void crear(HashSet<Libro> listado) {
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = read.next();
        System.out.println("Ingrese el autor del libro: ");
        String autor = read.next();
        System.out.println("Ingrese la cantidad de ejemplares: ");
        Integer ejemplares = read.nextInt();
        Libro nuevo = new Libro(titulo, autor, ejemplares);
        listado.add(nuevo);
    }

    /*Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
    busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
    método. El método se incrementa de a uno, como un carrito de compras, el
    atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
    cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
    que no queden ejemplares disponibles para prestar. Devuelve true si se ha
    podido realizar la operación y false en caso contrario*/
    public static boolean prestar(HashSet<Libro> conjunto, String libro) {
        for (Libro libro1 : conjunto) {
            if (libro1.getTitulo().equals(libro)) {
                if (libro1.getPrestados() == libro1.getEjemplares()) {
                    System.out.print("No hay ejemplares para prestar. ");
                    return false;
                } else {
                    System.out.print("Excelente! Hay un ejemplar disponible! ");
                    libro1.setPrestados(1 + libro1.getPrestados());
                    return true;
                }
            }
        }
        System.out.print("El libro indicado no existe. ");   
        return false;
    }
    //Prestamo

    /*Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
    lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
    El método decrementa de a uno, como un carrito de compras, el atributo
    ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
    vez que se produzca la devolución de un libro. No se podrán devolver libros
    donde que no tengan ejemplares prestados. Devuelve true si se ha podido
    realizar la operación y false en caso contrario.*/
    public static boolean devolver(HashSet<Libro> conjunto, String libro) {
        for (Libro libro1 : conjunto) {
            if (libro1.getTitulo().equals(libro)) {
                if (libro1.getPrestados() == 0) {
                    System.out.print("No hay ejemplares prestados. ");
                    return false;
                } else {
                    System.out.print("Gracias por su devolución! ");
                    libro1.setPrestados((libro1.getPrestados() - 1));
                    return true;
                }
            } else {
                System.out.print("El libro indicado no existe. ");
                return false;
            }
        }
        return false;
    }
    //fin devolucion

}
