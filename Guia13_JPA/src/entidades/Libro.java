package entidades;

import java.util.Objects;
import javax.persistence.*;

@Entity
public class Libro {

    @Id
    @Column(nullable = false)
    private Long ISBN;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private Integer anio;

    @Column(nullable = false)
    private Integer ejemplares;

    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;

    @Column(nullable = false)
    private Boolean alta;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Autor autor;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Editorial editorial;

    public Libro() {
    }

    public Libro(Long ISBN, String titulo, Integer anio, Integer ejemplares, Boolean alta, Autor autor, Editorial editorial) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = 0;
        this.ejemplaresRestantes = ejemplares;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.ISBN);
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.anio);
        hash = 79 * hash + Objects.hashCode(this.ejemplares);
        hash = 79 * hash + Objects.hashCode(this.ejemplaresPrestados);
        hash = 79 * hash + Objects.hashCode(this.ejemplaresRestantes);
        hash = 79 * hash + Objects.hashCode(this.alta);
        hash = 79 * hash + Objects.hashCode(this.autor);
        hash = 79 * hash + Objects.hashCode(this.editorial);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        if (!Objects.equals(this.anio, other.anio)) {
            return false;
        }
        if (!Objects.equals(this.ejemplares, other.ejemplares)) {
            return false;
        }
        if (!Objects.equals(this.ejemplaresPrestados, other.ejemplaresPrestados)) {
            return false;
        }
        if (!Objects.equals(this.ejemplaresRestantes, other.ejemplaresRestantes)) {
            return false;
        }
        if (!Objects.equals(this.alta, other.alta)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.editorial, other.editorial)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", titulo: " + titulo + ", anio: " + anio + ", autor: " + autor + ", editorial: " + editorial + ", ejemplares: " + ejemplares + ", prestados: " + ejemplaresPrestados + ", restantes: " + ejemplaresRestantes+'.';
    }



}
