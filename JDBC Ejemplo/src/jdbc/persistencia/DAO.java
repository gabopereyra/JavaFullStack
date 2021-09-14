package jdbc.persistencia;

import java.sql.*;

public class DAO {

    protected Connection conexion = null; // Administra la conexión entre el programa Java y la base de datos
    protected Statement sentencia = null; // Instrucción de consulta
    protected ResultSet resultado = null; // Maneja los resultados

    private final String USUARIO = "root";
    private final String CLAVE = "root";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/egg_ejemplo?useSSL=false";

    // Este método me permite establecer la conexión a mi base de datos
    public void conectarBase() throws Exception {
        try {
            Class.forName(DRIVER); // Carga el controlador o driver
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE); // Establece la conexión
        } catch (ClassNotFoundException | SQLException e) { 
            //ClassNotFoundException, es un error que se no puede encontrar el driver o hubo en error en su manejo
            //SQL Exception, error que proviene cuando quiere hacer la conexion.
            throw new Exception("Error al conectarse");
        }
    }

    // Este método me permite desconectarme de mi base de datos
    public void desconectarBase() throws Exception {
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
            throw new Exception("Error al desconectarse");
        }
    }

    // Este método me permite insertar, modificar y eliminar algún registro
    public void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            try {
                conexion.rollback(); // El rollback me permite volver hacia atrás una transacción
            } catch (SQLException ex) {
                throw new Exception("Error al ejecutar rollback");
            }
            throw new Exception("Error al ejecutar sentencia");
        } finally {
            desconectarBase();
        }
    }

    // Este método me permite realizar consultas y obtener resultados
    public void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            throw new Exception("Error al consultar");
        }
    }
}
