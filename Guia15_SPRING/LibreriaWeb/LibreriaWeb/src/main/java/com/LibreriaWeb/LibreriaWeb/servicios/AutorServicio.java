package com.LibreriaWeb.LibreriaWeb.servicios;

import com.LibreriaWeb.LibreriaWeb.repositorios.AutorRepositorio;
import com.LibreriaWeb.LibreriaWeb.entidades.Autor;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Transactional
    public void crear(String nombre) {
        Autor autor = new Autor();

        autor.setNombre(nombre);
        autor.setAlta(true);

        autorRepositorio.save(autor);
    }

    @Transactional
    public void modificar(Integer id, String nombre) {
        autorRepositorio.modificar(id, nombre);
    }

    @Transactional(readOnly = true)
    public List<Autor> buscarTodos() {
        return autorRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Autor buscarPorId(Integer id) {
        Optional<Autor> autorOptional = autorRepositorio.findById(id);
        return autorOptional.orElse(null);
    }

    @Transactional
    public void eliminar(Integer id) {
        autorRepositorio.deleteById(id);
    }
    @Transactional
    public void habilitar(Integer id, boolean flag) {
        autorRepositorio.habilitar(id, true);
    }
}
