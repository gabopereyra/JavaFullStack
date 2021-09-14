package tienda.persistencia;

import tienda.excepcion.MiExcepcion;
import java.sql.*;

public class DAO {

    protected Connection conexion = null; // Administra la conexión entre el programa Java y la base de datos
    protected Statement sentencia = null; // Instrucción de consulta
    protected ResultSet resultado = null; // Maneja los resultados

    private final String USUARIO = "root";
    private final String CLAVE = "root";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/tienda?useSSL=false";

    // Permite establecer la conexión a la base de datos
    public void conectarBase() throws MiExcepcion {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new MiExcepcion("Error al conectarse");
        }
    }

    // Desconectarme de la base de datos
    public void desconectarBase() throws MiExcepcion {
        try {
            if (sentencia != null) {
                sentencia.close();
            }
            if (resultado != null) {
                resultado.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            throw new MiExcepcion("Error al desconectarse");
        }
    }

    // Este método me permite insertar, modificar y eliminar algún registro
    public void insertarModificarEliminar(String sql) throws MiExcepcion {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            try {
                conexion.rollback(); // El rollback me permite volver hacia atrás una transacción
            } catch (SQLException ex) {
                throw new MiExcepcion("Error al ejecutar rollback");
            }
            throw new MiExcepcion("Error al ejecutar sentencia");
        } finally {
            desconectarBase();
        }
    }

    // Este método me permite realizar consultas y obtener resultados
    public void consultarBase(String sql) throws MiExcepcion {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            throw new MiExcepcion("Error al consultar");
        }
    }
}
