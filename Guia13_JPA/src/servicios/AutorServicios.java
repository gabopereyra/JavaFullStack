package servicios;

import entidades.Autor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import persistencia.AutorDAO;
import utilidades.Validaciones;

public class AutorServicios {

    private boolean auxValidacion = false;

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    AutorDAO autorDAO = new AutorDAO();

    public Autor crearAutor() {
        System.out.println("Ingrese el nombre del autor:");
        String nombre = read.nextLine();

        Autor nuevo = new Autor(nombre, true);

        return (autorDAO.guardarAutor(nuevo));
    }

    public void modificarEstadoAutor() {
        System.out.println("Ingrese el id del autor a modificar: ");
        int id = read.nextInt();

        autorDAO.modificarEstadoAutor(id);

    }

    public Autor editarAutor() {
        System.out.println("Ingrese el id del autor a editar: ");
        int id = read.nextInt();
        read.nextLine();

        if (autorDAO.verificarExistenciaID(id)) {
            System.out.println("Ingrese el nuevo nombre del autor:");
            String nombre = read.nextLine();

            return autorDAO.editarAutor(nombre, id);
        } else {
            System.out.println("El autor no existe.");
            return null;
        }
    }

    public Autor editarAutor(int id) {
        if (autorDAO.verificarExistenciaID(id)) {
            System.out.println("Ingrese el nuevo nombre del autor:");
            String nombre = read.nextLine();

            return autorDAO.editarAutor(nombre, id);
        } else {
            System.out.println("El autor no existe.");
            return null;
        }
    }

    public void buscarAutor() {
        System.out.println("Ingrese el nombre a buscar:");
        String nombre = read.nextLine();
        if (autorDAO.verificarExistenciaNombre(nombre)) {
            List<Autor> listado = autorDAO.devolverAutor(nombre);
            for (Autor autor : listado) {
                System.out.println(autor);
            }
        } else {
            System.out.println("El autor no existe.");
        }
    }

    public List<Integer> devolverIDAutor(String nombre) {
        List<Integer> listadoID = new ArrayList();
        List<Autor> listadoAutores = new ArrayList();
        if (autorDAO.verificarExistenciaNombre(nombre)) {
            listadoAutores = autorDAO.devolverAutor(nombre);
            for (Autor e : listadoAutores) {
                listadoID.add(e.getId());
            }
            return listadoID;

        } else {
            System.out.println("El autor no existe.");
            return null;
        }
    }

    public Autor ingresarAutor() {
        List<Autor> listadoAutores = new ArrayList();
        listadoAutores = autorDAO.devolverAutores();

        if (listadoAutores.size() == 0) {
            System.out.println("No existen autores, por favor cree uno:");
            return crearAutor();
        }

        return menu(listadoAutores);
    }

    private Autor menu(List<Autor> listadoAutores) {
        String valor = "";
        int i = 1;
        System.out.println("Seleccione una de las siguientes opciones:");
        for (Autor autor : listadoAutores) {
            System.out.println(i + ") " + autor.getNombre());
            i++;
        }
        System.out.println("0) Crear nuevo autor.");

        while (!auxValidacion) {
            valor = read.nextLine();
            auxValidacion = Validaciones.validarNumero(valor, listadoAutores.size());
        }
        auxValidacion = false;
        int opcionElegida = Integer.valueOf(valor);
        if(opcionElegida == 0){
            return crearAutor();
        }
        return listadoAutores.get(opcionElegida-1);
    }
    
    public void imprimirListado(){
        List<Autor> listado = autorDAO.devolverAutores();
        System.out.println("--------------\nEl listado de autores es:");
        for (Autor autor : listado) {
            System.out.println("ID: "+autor.getId()+" - "+autor.getNombre());
        }
        System.out.println("");
        
    }
}
