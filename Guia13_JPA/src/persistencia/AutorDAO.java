/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Autor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

public class AutorDAO {

    private EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();

    public Autor guardarAutor(Autor autor) {
        try {
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();

            System.out.println("El autor se guardo correctamente.");

            return autor;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo guardar el Autor.");
            return null;
        }
    } //Metodo guardar Autor

    public void modificarEstadoAutor(int id) {
        try {

            Autor autor = em.find(Autor.class, id);
            if (autor.getAlta()) {
                autor.setAlta(Boolean.FALSE);
            } else {
                autor.setAlta(Boolean.TRUE);
            }

            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();

            System.out.println("El autor se modificó correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("El autor no se pudo dar de baja.");
        }
    }

    public boolean verificarExistenciaID(int id) {
        Autor autor = em.find(Autor.class, id);
        return !Objects.equals(null, autor);
    }

    public boolean verificarExistenciaNombre(String nombre) {
        try {
            List<Autor> listado = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getResultList();
            return !Objects.equals(null, listado);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la consulta.");
            return false;
        }
    }

    public Autor editarAutor(String nombre, int id) {
        try {

            Autor autor = em.find(Autor.class, id);
            autor.setNombre(nombre);

            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();

            System.out.println("El autor se modificó correctamente.");

            return autor;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("El autor no se pudo modificar.");
            return null;
        }
    }

    public List<Autor> devolverAutor(String nombre) {
        List<Autor> listado = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        return listado;
    }

    public List<Autor> devolverAutores() {
        List<Autor> listado = new ArrayList();
        try {
            listado = em.createQuery("SELECT a FROM Autor a WHERE a.alta =1").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la consulta.");
        }
        return listado;
    }

}
