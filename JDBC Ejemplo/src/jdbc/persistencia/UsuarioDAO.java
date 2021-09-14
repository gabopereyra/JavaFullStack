package jdbc.persistencia;

import java.util.ArrayList;
import java.util.List;
import jdbc.entidad.Usuario;

// Esta clase hereda de DAO a fin de poder interactuar con mi base de datos
public class UsuarioDAO extends DAO {

    public void guardarUsuario(Usuario usuario) throws Exception {
        try {
            if (usuario == null) {
                throw new Exception("Usuario inválido");
            }

            // Se crea la sentencia SQL usando el método estático FORMAT de la clase String
            String plantilla = "INSERT INTO usuario(correo, nombre, apellido) VALUES('%s', '%s', '%s');";
            String sql = String.format(plantilla, usuario.getCorreo(), usuario.getNombre(), usuario.getApellido());

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al guardar usuario");
        }
    }

    public void modificarUsuario(Usuario usuario) throws Exception {
        try {
            if (usuario == null) {
                throw new Exception("Usuario inválido");
            }

            // Se crea la sentencia SQL usando concatenación
            String sql = "UPDATE usuario SET nombre = '" + usuario.getNombre() + "', "
                    + "apellido = '" + usuario.getApellido() + "' "
                    + "WHERE correo = '" + usuario.getCorreo() + "';";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al modificar usuario");
        }
    }

    public void eliminarUsuario(String correo) throws Exception {
        try {
            // Se crea la sentencia SQL
            String sql = "DELETE FROM usuario WHERE correo = '" + correo + "';";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al eliminar usuario");
        }
    }

    public List<Usuario> obtenerUsuarios() throws Exception {
        try {
            // Se crea la sentencia SQL
            String sql = "SELECT correo, nombre, apellido FROM usuario;";

            consultarBase(sql);

            List<Usuario> usuarios = new ArrayList<>();
            Usuario usuario = null;

            // Me aseguro que haya obtenido resultados de mi consulta
            while (resultado.next()) {
                // Se recupera la información de mi base de datos alojándola en mi lista de usuarios
                usuario = new Usuario();

                usuario.setCorreo(resultado.getString(1));
                usuario.setNombre(resultado.getString(2));
                usuario.setApellido(resultado.getString(3));

                usuarios.add(usuario);
            }

            // Retorno mi lista de usuarios con la información que me proporcionó mi base de datos
            return usuarios;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener usuarios");
        } finally {
            // Este bloque de código siempre se va a ejecutar independientemente de lo que suceda
            desconectarBase();
        }
    }
}
