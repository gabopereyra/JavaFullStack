package com.LibreriaWeb.LibreriaWeb.repositorios;

import com.LibreriaWeb.LibreriaWeb.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String>{
        
    @Modifying
    @Query("UPDATE Usuario u SET u.username = :username WHERE u.id = :id")
    void modificar(@Param("id") Integer id, @Param("username") String nombre);
    
//    @Query("SELECT u FROM Usuario u WHERE u.username = :username")
//    Usuario buscarUsuarioPorUsername(@Param("username") String username);
    
    Optional<Usuario> findByUsername(String username);  // ES OTRA FORMA DE EJECUTAR LA QUERY ANTERIOR, sin necesidad de escribir todo
    
   // boolean existsUsername(String username);
}
