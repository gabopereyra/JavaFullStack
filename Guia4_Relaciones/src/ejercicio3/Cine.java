package ejercicio3;

import java.util.List;

public class Cine {
    private Pelicula pelicula;
    private List<Espectador> espectadores;
    private Double precio;

    public Cine(Pelicula pelicula, List<Espectador> espectadores, Double precio) {
        this.pelicula = pelicula;
        this.espectadores = espectadores;
        this.precio = precio;
    }


    public Cine() {
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    void asignarEspectadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
