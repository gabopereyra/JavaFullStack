package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Fabricante;
import tienda.excepcion.MiExcepcion;

public class FabricanteDAO extends DAO {

    public void insertarFabricante(String nombre) throws MiExcepcion {
        try {
            String plantilla = "INSERT INTO fabricante(nombre) VALUES('%s');";
            String sql = String.format(plantilla, nombre);

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }//Fin insertar fabricante

    public List<Fabricante> mostrarFabricantes() throws MiExcepcion {
        try {
            String sql = "SELECT * FROM fabricante;";

            consultarBase(sql);

            List<Fabricante> listado = new ArrayList<>();

            while (resultado.next()) {
                Fabricante fabricante = new Fabricante();

                fabricante.setCodigo(Integer.valueOf(resultado.getString(1)));
                fabricante.setNombre(resultado.getString(2));

                listado.add(fabricante);
            }
            return listado;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener fabricantes.");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
