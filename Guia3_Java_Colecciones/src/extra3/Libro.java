/*
La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
 */
package extra3;

import java.util.HashSet;
import java.util.Scanner;

public class Libro {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private String titulo;
    private String autor;
    private Integer ejemplares;
    private Integer prestados = 0;

//Constructores
    public Libro(String titulo, String autor, Integer ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
    }

    public Libro() {
    }
    //Fin constructores

    //GET && SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }

    //END GET && SET
}
