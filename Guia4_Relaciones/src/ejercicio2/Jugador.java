/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6
 */
package ejercicio2;

public class Jugador {
    private Integer id;
    private String nombre;
    private boolean mojado = false;

    public Jugador(Integer id) {
        this.id = id;
        this.nombre = "Jugador "+id;
    }

    public Jugador() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(Integer id) {
        this.nombre = "Jugador "+id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
