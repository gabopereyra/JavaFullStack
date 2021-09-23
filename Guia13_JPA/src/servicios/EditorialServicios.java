package servicios;

import java.util.Scanner;
import persistencia.EditorialDAO;
import entidades.Editorial;
import java.util.ArrayList;
import java.util.List;
import utilidades.Validaciones;

public class EditorialServicios {

    private boolean auxValidacion = false;

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    EditorialDAO editorialDAO = new EditorialDAO();

    public Editorial crearEditorial() {
        System.out.println("Ingrese el nombre de la Editorial:");
        String nombre = read.nextLine();

        Editorial nuevo = new Editorial(nombre, true);

        return (editorialDAO.guardarEditorial(nuevo));

    }

    public void modificarEstadoEditorial() {
        System.out.println("Ingrese el id de la editorial a modificar: ");
        int id = read.nextInt();

        editorialDAO.modificarEstadoEditorial(id);

    }

    public Editorial editarEditorial() {
        System.out.println("Ingrese el id del autor a editar: ");
        int id = read.nextInt();
        read.nextLine();

        if (editorialDAO.verificarExistenciaID(id)) {
            System.out.println("Ingrese el nuevo nombre de la editorial:");
            String nombre = read.nextLine();

            return editorialDAO.editarEditorial(nombre, id);
        } else {
            System.out.println("la editorial no existe.");
            return null;
        }
    }

    public Editorial editarEditorial(int id) {
        if (editorialDAO.verificarExistenciaID(id)) {
            System.out.println("Ingrese el nuevo nombre de la editorial:");
            String nombre = read.nextLine();

            return editorialDAO.editarEditorial(nombre, id);
        } else {
            System.out.println("la editorial no existe.");
            return null;
        }
    }

    public List<Integer> devolverIDEditorial(String nombre) {
        List<Integer> listadoID = new ArrayList();
        List<Editorial> listadoEditorial = new ArrayList();
        if (editorialDAO.verificarExistenciaNombre(nombre)) {
            listadoEditorial = editorialDAO.devolverEditorial(nombre);
            for (Editorial e : listadoEditorial) {
                listadoID.add(e.getId());
            }
            return listadoID;

        } else {
            System.out.println("El autor no existe.");
            return null;
        }
    }

    public Editorial ingresarEditorial() {
        List<Editorial> listadoEditorial = new ArrayList();
        listadoEditorial = editorialDAO.devolverEditoriales();

        if (listadoEditorial.size() == 0) {
            System.out.println("No existen editoriales, por favor cree una:");
            return crearEditorial();
        }

        return menu(listadoEditorial);
    }

    private Editorial menu(List<Editorial> listadoEditoriales) {
        String valor = "";
        int i = 1;

        System.out.println("Seleccione una de las siguientes opciones:");
        for (Editorial editorial : listadoEditoriales) {
            System.out.println(i + ") " + editorial.getNombre());
            i++;
        }
        System.out.println("0) Crear nueva Editorial.");

        while (!auxValidacion) {
            valor = read.nextLine();
            auxValidacion = Validaciones.validarNumero(valor, listadoEditoriales.size());
        }
        auxValidacion = false;
        int opcionElegida = Integer.valueOf(valor);
        if (opcionElegida == 0) {
            return crearEditorial();
        }
        return listadoEditoriales.get(opcionElegida - 1);
    }

    public void imprimirListado() {
        List<Editorial> listado = editorialDAO.devolverEditoriales();
        System.out.println("--------------\nEl listado de editoriales es:");
        for (Editorial editorial : listado) {
            System.out.println("ID: " + editorial.getId() + " - " + editorial.getNombre());
        }
        System.out.println("");
    }

}
