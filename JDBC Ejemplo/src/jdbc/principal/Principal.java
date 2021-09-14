package jdbc.principal;

import java.util.Scanner;
import jdbc.servicio.UsuarioServicio;

// CAPA PRINCIPAL
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        UsuarioServicio usuarioServicio = new UsuarioServicio();

        try {
            // Se imprime la lista de usuarios
            usuarioServicio.imprimirUsuarios();

            // Se solicita información al usuario
            System.out.println("Ingrese correo: ");
            String correo = entrada.next();

            System.out.println("Ingrese nombre: ");
            String nombre = entrada.next();

            System.out.println("Ingrese apellido: ");
            String apellido = entrada.next();

            // Se crea un objeto de tipo Usuario
            usuarioServicio.crearUsuario(correo, nombre, apellido);

            // Se imprime la lista de usuarios para verificar que el usuario previamente creado logró persistirse
            usuarioServicio.imprimirUsuarios();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
