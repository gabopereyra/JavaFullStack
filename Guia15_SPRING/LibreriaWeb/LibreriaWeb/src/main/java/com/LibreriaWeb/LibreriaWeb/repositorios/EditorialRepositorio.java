
package com.LibreriaWeb.LibreriaWeb.repositorios;

import com.LibreriaWeb.LibreriaWeb.entidades.Editorial;
import com.LibreriaWeb.LibreriaWeb.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, Integer> {

    @Modifying
    @Query("UPDATE Editorial e SET e.nombre = :nombre WHERE e.id = :id")
    void modificar(@Param("id") Integer id, @Param("nombre") String nombre);
    
    @Modifying
    @Query("UPDATE Editorial e SET e.alta = :alta WHERE e.id = :id")
    void habilitar(@Param("id") Integer id, @Param("alta") boolean flag);
}
