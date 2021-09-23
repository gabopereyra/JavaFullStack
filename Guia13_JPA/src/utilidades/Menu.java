/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Scanner;
import servicios.*;

public class Menu {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    LibroServicios libro = new LibroServicios();
    EditorialServicios editorial = new EditorialServicios();
    AutorServicios autor = new AutorServicios();

    public void ejecutarMenu() {
        String salida = "";
        while (!salida.equals("0")) {

            opcionesGenerales();
            salida = read.nextLine();

            switch (salida) {
                case "0":
                    System.out.println("--FIN DE LA SESIÓN--");
                    break;
                case "1":
                    menuLibros();
                    break;
                case "2":
                    menuAutores();
                    break;
                case "3":
                    menuEditoriales();
                    break;
                default:
                    System.out.println("La opción ingresada es inválida, intente nuevamente.");
                    break;
            }
        }
    }

    private void menuLibros() {
        String salida = "";
        while (!salida.equals("0")) {
            System.out.println("----------------\n"
                    + "Seleccione una opción:\n"
                    + "1) Ingresar libro.\n"
                    + "2) Buscar libro por ISBN\n"
                    + "3) Buscar libro por titulo\n"
                    + "4) Buscar libro por autor\n"
                    + "5} Buscar libro por editorial\n"
                    + "6) Dar de baja/alta un libro\n"
                    + "7) Ver listado libros.\n"
                    + "0) VOLVER.\n"
                    + "----------------");
            salida = read.nextLine();

            switch (salida) {
                case "0":
                    break;
                case "1":
                    libro.crearLibro();
                    break;
                case "2":
                    libro.devolverLibroPorISBN();
                    break;
                case "3":
                    libro.devolverLibroPorNombre();
                    break;
                case "4":
                    libro.devolverLibroPorAutor();
                    break;
                case "5":
                    libro.devolverLibroPorEditorial();
                    break;
                case "6":
                    libro.modificarEstadoLibro();
                    break;
                case "7":
                    libro.imprimirListado();
                    break;
                default:
                    System.out.println("La opción ingresada es inválida, intente nuevamente.");
                    break;
            }

        }
    } //Fin menu libros

    private void menuAutores() {
        String salida = "";
        while (!salida.equals("0")) {
            System.out.println("----------------\n"
                    + "Seleccione una opción:\n"
                    + "1) Ingresar autor.\n"
                    + "2) Modificar autor.\n"
                    + "3) Dar de baja/alta un autor.\n"
                    + "4) Ver listado autores.\n"
                    + "5} Buscar libro por autor\n"
                    + "0) VOLVER.\n"
                    + "----------------");
            salida = read.nextLine();

            switch (salida) {
                case "0":
                    break;
                case "1":
                    autor.crearAutor();
                    break;
                case "2":
                    autor.editarAutor();
                    break;
                case "3":
                    autor.modificarEstadoAutor();
                    break;
                case "4":
                    autor.imprimirListado();
                    break;
                case "5":
                    libro.devolverLibroPorAutor();
                    break;
                default:
                    System.out.println("La opción ingresada es inválida, intente nuevamente.");
                    break;
            }

        }
    } //Fin menu autores

    private void menuEditoriales() {
        String salida = "";
        while (!salida.equals("0")) {
            System.out.println("----------------\n"
                    + "Seleccione una opción:\n"
                    + "1) Ingresar editorial.\n"
                    + "2) Modificar editorial.\n"
                    + "3) Dar de baja/alta una editorial\n"
                    + "4) Ver listado editoriales.\n"
                    + "5} Buscar libro por editorial\n"
                    + "0) VOLVER.\n"
                    + "----------------");
            salida = read.nextLine();

            switch (salida) {
                case "0":
                    break;
                case "1":
                    editorial.crearEditorial();
                    break;
                case "2":
                    editorial.editarEditorial();
                    break;
                case "3":
                    editorial.modificarEstadoEditorial();
                    break;
                case "4":
                    editorial.imprimirListado();
                    break;
                case "5":
                    libro.devolverLibroPorEditorial();
                    break;
                default:
                    System.out.println("La opción ingresada es inválida, intente nuevamente.");
                    break;
            }
        }
    } //Fin menu editorial

    private void opcionesGenerales() {
        System.out.println("----------------\n"
                + "Seleccione una opción:\n"
                + "1) Libros.\n"
                + "2) Autores.\n"
                + "3) Editorial.\n"
                + "0) SALIR.\n"
                + "----------------");
    }
}
