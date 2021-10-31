package com.LibreriaWeb.LibreriaWeb.repositorios;

import com.LibreriaWeb.LibreriaWeb.entidades.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Integer> {

    @Modifying
    @Query("UPDATE Libro a SET a.titulo = :titulo, a.anio=:anio, a.autor=:autor, a.editorial=:editorial, a.ejemplares = :ejemplares WHERE a.id = :id")
    void modificar(@Param("id") Integer id, @Param("titulo") String titulo, @Param("anio") Integer anio, @Param("autor") Autor autor, @Param("editorial") Editorial editorial, @Param("ejemplares") Integer ejemplares );
}
