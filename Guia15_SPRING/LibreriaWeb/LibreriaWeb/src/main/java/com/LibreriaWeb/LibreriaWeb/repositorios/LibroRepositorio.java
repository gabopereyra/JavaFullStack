package com.LibreriaWeb.LibreriaWeb.repositorios;

import com.LibreriaWeb.LibreriaWeb.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Integer> {

    @Modifying
    @Query("UPDATE Libro a SET a.titulo = :nombre WHERE a.id = :id")
    void modificar(@Param("id") Integer id, @Param("nombre") String titulo);

}
