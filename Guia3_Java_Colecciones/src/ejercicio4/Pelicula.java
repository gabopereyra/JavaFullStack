package ejercicio4;

public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracion;
    
    //
    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }
    // Constructor 

    //Get && Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    //END Get && Set

    @Override
    public String toString() {
        return "titulo: " + titulo + ", Director: " + director + ", Duración: " + duracion + " minutos.";
    }
    
    
}
