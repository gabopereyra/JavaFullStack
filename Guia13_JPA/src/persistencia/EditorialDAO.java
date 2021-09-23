package persistencia;

import entidades.Editorial;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

public class EditorialDAO {

    private EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();

    public Editorial guardarEditorial(Editorial editorial) {
        try {
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();

            System.out.println("La editorial se guardo correctamente.");

            return editorial;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo guardar la editorial.");

            return null;
        }
    } //Metodo guardarEditorial

    public void modificarEstadoEditorial(int id) {
        try {

            Editorial editorial = em.find(Editorial.class, id);
            if (editorial.getAlta()) {
                editorial.setAlta(Boolean.FALSE);
            } else {
                editorial.setAlta(Boolean.TRUE);
            }

            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();

            System.out.println("La editorial se modificó correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("La editorial no se pudo dar de baja.");
        }
    }

    public boolean verificarExistenciaID(int id) {
        Editorial editorial = em.find(Editorial.class, id);
        return !Objects.equals(null, editorial);
    }

    public Editorial editarEditorial(String nombre, int id) {
        try {

            Editorial editorial = em.find(Editorial.class, id);
            editorial.setNombre(nombre);

            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();

            System.out.println("La editorial se modificó correctamente.");
            return editorial;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("La editorial  no se pudo modificar.");
            return null;
        }
    }

    public boolean verificarExistenciaNombre(String nombre) {
        try {
            List<Editorial> listado = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre").setParameter("nombre", nombre).getResultList();
            return !Objects.equals(null, listado);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la consulta.");
            return false;
        }
    }

    public List<Editorial> devolverEditorial(String nombre) {
        List<Editorial> listado = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        return listado;
    }

    public List<Editorial> devolverEditoriales() {
        List<Editorial> listado = new ArrayList();
        try {
            listado = em.createQuery("SELECT e FROM Editorial e WHERE e.alta=1").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo ejecutar la consulta.");
        }
        return listado;
    }
}
