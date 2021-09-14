package tienda.servicios;

import java.util.List;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.excepcion.MiExcepcion;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicio {

    private FabricanteDAO fabricanteDAO;

    public FabricanteServicio() {
        fabricanteDAO = new FabricanteDAO();
    }

    public void crearFabricante() throws MiExcepcion {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre del fabricante:");
        String nombre = read.nextLine();

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new MiExcepcion("El nombre es obligatorio");
            }

            fabricanteDAO.insertarFabricante(nombre);
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    } //fin metodo crear Fabricante

    public void mostrarListado() throws MiExcepcion {
        try {
            List<Fabricante> listado = fabricanteDAO.mostrarFabricantes();
            
            for (Fabricante fabricante : listado) {
                System.out.println(fabricante);
            }
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    } //Fin mostrar Listado Fabricantes
}
