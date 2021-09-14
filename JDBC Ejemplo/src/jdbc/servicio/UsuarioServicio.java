package jdbc.servicio;

import java.util.List;
import jdbc.entidad.Usuario;
import jdbc.persistencia.UsuarioDAO;

// CAPA DE SERVICIO (LÓGICA DE NEGOCIO)
public class UsuarioServicio {

    // Se define un atributo de tipo UsuarioDAO para poder acceder a sus métodos
    private UsuarioDAO usuarioDAO;

    public UsuarioServicio() {
        usuarioDAO = new UsuarioDAO();
    }

    public void crearUsuario(String correo, String nombre, String apellido) throws Exception {
        try {
            // Establezco los criterios de validación sobre la información que deseo persistir
            if (correo == null || correo.trim().isEmpty()) {
                throw new Exception("Debe ingresar un correo");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre");
            }

            if (apellido == null || apellido.trim().isEmpty()) {
                throw new Exception("Debe ingresar un apellido");
            }

            // Una vez que la información ingresada por el usuario es válida, se crea un objeto de tipo Usuario
            Usuario usuario = new Usuario();

            usuario.setCorreo(correo);
            usuario.setNombre(nombre);
            usuario.setApellido(apellido);

            // A través de mi objeto usuarioDAO accedo al método que me permite interactuar con mi base de datos
            usuarioDAO.guardarUsuario(usuario);
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirUsuarios() throws Exception {
        try {
            // Se obtiene la información de los usuarios registrados
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();

            // Se verifica que la lista no venga vacía
            if (usuarios.isEmpty()) {
                throw new Exception("No existen usuarios");
            } else {
                // En caso de que tenga información, se procede a imprimir en consola la información
                System.out.println("*** LISTA DE USUARIOS");
                System.out.printf("%-25s%-15s%15s\n", "CORREO", "NOMBRE", "APELLIDO");
                for (Usuario usuario : usuarios) {
                    System.out.printf("%-25s%-15s%15s\n", usuario.getCorreo(), usuario.getNombre(), usuario.getApellido());
                }
            }
        } catch (Exception e) {
            throw e; // Se lanza la excepción al método main
        }
    }
}
