/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.*;
import utilidades.Validaciones;
import java.util.List;
import java.util.Scanner;
import persistencia.LibroDAO;

public class LibroServicios {

    private boolean auxValidacion = false;

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    LibroDAO libroDAO = new LibroDAO();
    AutorServicios autorServicio = new AutorServicios();
    EditorialServicios editorialServicio = new EditorialServicios();

    public void crearLibro() {
        String ISBN = "";
        String anio = "";
        String titulo = "";
        String ejemplares = "";
        Autor autor = null;
        Editorial editorial = null;

        while (!auxValidacion) {
            System.out.println("Ingrese el ISBN:");
            ISBN = read.nextLine();
            auxValidacion = Validaciones.validarISBN(ISBN);
        }
        auxValidacion = false;

        while (!auxValidacion) {
            System.out.println("Ingrese el año de publicación:");
            anio = read.nextLine();
            auxValidacion = Validaciones.validarAnio(anio);
        }
        auxValidacion = false;

        while (!auxValidacion) {
            System.out.println("Ingrese el titulo del libro:");
            titulo = read.nextLine();
            auxValidacion = Validaciones.validarTitulo(titulo);
        }
        auxValidacion = false;

        while (!auxValidacion) {
            System.out.println("Ingrese el total de ejemplares:");
            ejemplares = read.nextLine();
            auxValidacion = Validaciones.validarEjemplares(ejemplares);
        }
        auxValidacion = false;

        autor = autorServicio.ingresarAutor();

        editorial = editorialServicio.ingresarEditorial();

        Libro libro = new Libro(Long.valueOf(ISBN), titulo, Integer.valueOf(anio), Integer.valueOf(ejemplares), true, autor, editorial);
        libroDAO.guardarLibro(libro);
    }

    public void modificarEstadoLibro() {
        System.out.println("Ingrese el ISBN del libro a modificar: ");
        long ISBN = read.nextLong();

        libroDAO.modificacionEstadoLibro(ISBN);
    }

    public void editarLibro() {
        System.out.println("Ingrese el ISBN del libro a editar: ");
        long ISBN = read.nextLong();

        if (libroDAO.verificarExistenciaISBN(ISBN)) {
            System.out.println("Ingrese el año de publicación:");
            int anio = read.nextInt();
            read.nextLine(); // Para limpiar buffer
            System.out.println("Ingrese el titulo del libro:");
            String titulo = read.nextLine();
            System.out.println("Ingrese el total de ejemplares:");
            int ejemplares = read.nextInt();

            System.out.println("Ingrese el ID del autor:");
            int idAutor = read.nextInt();

            System.out.println("Ingrese el ID de la editorial:");
            int idEditorial = read.nextInt();

            libroDAO.editarLibro(ISBN, anio, titulo, ejemplares, idAutor, idEditorial);

        } else {
            System.out.println("El libro no existe.");
        }
    }

    public void devolverLibroPorISBN() {
        System.out.println("Ingrese el codigo del libro a buscar:");
        long ISBN = read.nextLong();
        Libro libro = libroDAO.devolverLibroPorISBN(ISBN);

        if (libro == null) {
            System.out.println("El libro no existe.");
        } else {
            System.out.println(libro);
        }
    }

    public void devolverLibroPorNombre() {
        System.out.println("Ingrese el nombre del libro a buscar:");
        String nombre = read.nextLine();
        List<Libro> libros = libroDAO.devolverLibroPorNombre(nombre);

        if (libros.isEmpty()) {
            System.out.println("No existen libros con dicho nombre.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    public void devolverLibroPorAutor() {
        System.out.println("Ingrese el nombre del autor:");
        String nombre = read.nextLine();
        List<Libro> libros = libroDAO.devolverLibroPorAutor(nombre);

        if (libros.isEmpty()) {
            System.out.println("No existen libros con dicho autor.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    public void devolverLibroPorEditorial() {
        System.out.println("Ingrese el nombre de ka editorial:");
        String nombre = read.nextLine();
        List<Libro> libros = libroDAO.devolverLibroPorEditorial(nombre);

        if (libros.isEmpty()) {
            System.out.println("No existen libros con dicho autor.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    public void imprimirListado() {
        List<Libro> listado = libroDAO.devolverListado();
        System.out.println("El listado de libros es el siguiente:");

        if (listado.isEmpty()) {
            System.out.println("NO EXISTEN LIBROS");
        } else {
            for (Libro libro : listado) {
                System.out.println(libro);
            }
        }
    }

}
