package tienda.persistencia;

import java.sql.SQLException;
import tienda.entidades.Producto;
import tienda.excepcion.MiExcepcion;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO extends DAO {

    public List<String> obtenerProductos() throws MiExcepcion {
        try {
            String sql = "SELECT nombre FROM producto ORDER BY nombre ASC;";

            consultarBase(sql);

            List<String> listado = new ArrayList<>();

            while (resultado.next()) {
                listado.add(resultado.getString(1));
            }
            return listado;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de productos.");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<String> obtenerNombresYPrecios() throws MiExcepcion {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY nombre ASC;";

            consultarBase(sql);

            List<String> listado = new ArrayList<>();

            while (resultado.next()) {
                listado.add(resultado.getString(1) + " - Precio: $" + resultado.getString(2));
            }
            return listado;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de productos.");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    } //Fin obtener nombres y precios

    public List<String> productosRangoPrecio() throws MiExcepcion {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE precio BETWEEN 120 AND 202 ORDER BY nombre ASC;";

            consultarBase(sql);

            List<String> listado = new ArrayList<>();

            while (resultado.next()) {
                listado.add(resultado.getString(1) + " - Precio: $" + resultado.getString(2));
            }
            return listado;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de productos.");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<String> obtenerPortatiles() throws MiExcepcion {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE nombre LIKE '%portatil%' ORDER BY nombre ASC;";

            consultarBase(sql);

            List<String> listado = new ArrayList<>();

            while (resultado.next()) {
                listado.add(resultado.getString(1) + " - Precio: $" + resultado.getString(2));
            }
            return listado;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener nombres de productos.");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public String productoMasBarato() throws MiExcepcion {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;";

            consultarBase(sql);

            if (resultado.next()) {
                return resultado.getString(1) + " - Precio: $" + resultado.getString(2);
            }
            return "";
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener producto más barato");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    } //Fin producto mas barato

    public void insertarProducto(String nombre, double precio, int codigoFabricante) throws MiExcepcion {
        try {
            String plantilla = "INSERT INTO producto(nombre, precio, codigo_fabricante) "
                    + "VALUES('%s', " + precio + ", %d)";
            String sql = String.format(plantilla, nombre, codigoFabricante);

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    } //Fin insertar producto

    public List<Producto> mostrarProductos() throws MiExcepcion {
        try {
            String sql = "SELECT * FROM producto;";

            consultarBase(sql);

            List<Producto> listado = new ArrayList<>();

            while (resultado.next()) {
                Producto producto = new Producto();

                producto.setCodigo(Integer.valueOf(resultado.getString(1)));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(Double.valueOf(resultado.getString(3)));
                producto.setCodigo_fabricante(Integer.valueOf(resultado.getString(4)));

                listado.add(producto);
            }
            return listado;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al obtener productos.");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public boolean existeProducto(int codigo) throws MiExcepcion {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + ";";

            consultarBase(sql);
            
            return resultado.next();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al realizar consulta.");
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    } //Validar si existe ID producto.
    
    public void editarProducto(String nombre, double precio, int codigoFabricante, int codigo) throws MiExcepcion {

        try {
            
            String plantilla = "UPDATE producto SET nombre = '%s', precio = "+precio+", codigo_fabricante = %s WHERE codigo = %d;";

            String sql = String.format(plantilla, nombre, codigoFabricante, codigo);

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
    } //Fin insertar producto


}
