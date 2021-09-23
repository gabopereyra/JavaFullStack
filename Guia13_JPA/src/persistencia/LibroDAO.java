/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.*;
import java.util.ArrayList;
import servicios.*;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

public class LibroDAO {

    private EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();

    public void guardarLibro(Libro libro) {
        try {
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();

            System.out.println("El libro se guardo correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo guardar el libro.");
        }
    }

    public void modificacionEstadoLibro(long ISBN) {
        try {

            if (verificarExistenciaISBN(ISBN)) {
                Libro libro = em.find(Libro.class, ISBN);
                if (libro.getAlta()) {
                    libro.setAlta(Boolean.FALSE);
                } else {
                    libro.setAlta(Boolean.TRUE);
                }
                em.getTransaction().begin();
                em.merge(libro);
                em.getTransaction().commit();

                System.out.println("El libro se modificó correctamente.");
            } else {
                System.out.println("El libro no existe.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("El libro no se pudo dar de baja.");
        }
    }

    public boolean verificarExistenciaISBN(long ISBN) {
        Libro libro = em.find(Libro.class, ISBN);
        return !Objects.equals(null, libro);
    }

    public Libro devolverLibroPorISBN(long ISBN) {
        if (verificarExistenciaISBN(ISBN)) {
            return em.find(Libro.class, ISBN);
        }
        return null;
    }

    public List<Libro> devolverLibroPorNombre(String nombre) {
        try {
            List<Libro> listado = em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :nombre").setParameter("nombre", nombre).getResultList();
            return listado;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la consulta.");
            return null;
        }
    }

    public List<Libro> devolverLibroPorAutor(String nombre) {
        try {
            AutorServicios as = new AutorServicios();

            List<Integer> listadoID = as.devolverIDAutor(nombre);
            List<Libro> listadoLibros = new ArrayList();

            for (Integer e : listadoID) {
                List<Libro> libro = em.createQuery("SELECT l FROM Libro l WHERE l.autor = :e", Libro.class).setParameter("e", e).getResultList();
                for (Libro libro1 : libro) {
                    listadoLibros.add(libro1);
                }
            }
            return listadoLibros;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la consulta.");
            return null;
        }
    }

    public List<Libro> devolverLibroPorEditorial(String nombre) {
        try {
            EditorialServicios es = new EditorialServicios();

            List<Integer> listadoID = es.devolverIDEditorial(nombre);
            List<Libro> listadoLibros = new ArrayList();

            for (Integer e : listadoID) {
                List<Libro> libro = em.createQuery("SELECT l FROM Libro l WHERE l.autor = :e", Libro.class).setParameter("e", e).getResultList();
                for (Libro libro1 : libro) {
                    listadoLibros.add(libro1);
                }
            }
            return listadoLibros;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la consulta.");
            return null;
        }
    }

    public int devolverIDAutor(long ISBN) {
        if (verificarExistenciaISBN(ISBN)) {
            Libro libro = em.find(Libro.class, ISBN);
            return libro.getAutor().getId();
        }
        return -1;
    }

    public Autor devolverAutor(int id) {
        AutorDAO autorDAO = new AutorDAO();

        if (autorDAO.verificarExistenciaID(id)) {
            Autor autor = em.find(Autor.class, id);
            return autor;
        }
        return null;
    }

    public int devolverIDEditorial(long ISBN) {
        if (verificarExistenciaISBN(ISBN)) {
            Libro libro = em.find(Libro.class, ISBN);
            return libro.getEditorial().getId();
        }
        return -1;
    }

    public Editorial devolverEditorial(int id) {
        EditorialDAO editorialDAO = new EditorialDAO();

        if (editorialDAO.verificarExistenciaID(id)) {
            Editorial editorial = em.find(Editorial.class, id);
            return editorial;
        }
        return null;
    }

    public void editarLibro(long ISBN, int anio, String titulo, int ejemplares, int idAutor, int idEditorial) {
        try {
            Libro editar = em.find(Libro.class, ISBN);
            editar.setAnio(anio);
            editar.setTitulo(titulo);
            editar.setEjemplares(ejemplares);
            editar.setEjemplaresRestantes(ejemplares);
            editar.setAutor(devolverAutor(idAutor));
            editar.setEditorial(devolverEditorial(idEditorial));

            em.getTransaction().begin();
            em.merge(editar);
            em.getTransaction().commit();

            System.out.println("El libro se modificó correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("El libro no se pudo modificar.");
        }

    }

    public List<Libro> devolverListado() {
        List<Libro> listado = new ArrayList();
        try {
            listado = em.createQuery("SELECT l FROM Libro l WHERE l.alta=1").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la consulta.");
        }
        return listado;
    }

}
