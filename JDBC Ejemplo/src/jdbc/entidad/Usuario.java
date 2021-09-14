package jdbc.entidad;

// ENTIDAD
public class Usuario {

    // ATRIBUTOS
    private String correo;
    private String nombre;
    private String apellido;

    // CONSTRUCTORES
    public Usuario() {
    }

    public Usuario(String correo, String nombre, String apellido) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // SETTERS Y GETTERS
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
