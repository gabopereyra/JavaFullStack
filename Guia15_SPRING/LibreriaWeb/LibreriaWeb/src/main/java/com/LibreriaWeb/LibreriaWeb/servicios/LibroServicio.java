package com.LibreriaWeb.LibreriaWeb.servicios;

import com.LibreriaWeb.LibreriaWeb.entidades.*;
import com.LibreriaWeb.LibreriaWeb.repositorios.*;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServicio {

    @Autowired
    private EditorialRepositorio editorialRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private LibroRepositorio libroRepositorio;

    @Transactional
    public void crear(Long ISBN, String titulo, Integer anio, Integer ejemplares, Integer autorID, Integer editorialID) {
        Libro libro = new Libro();
        libro.setISBN(ISBN);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(0);
        libro.setEjemplaresRestantes(ejemplares);
        libro.setAlta(true);
        libro.setAutor(autorRepositorio.findById(autorID).orElse(null));
        libro.setEditorial(editorialRepositorio.findById(editorialID).orElse(null));

        libroRepositorio.save(libro);
    }
    
    
    @Transactional
    public void modificar(Integer id, String titulo, Integer anio, Autor autor, Editorial editorial, Integer ejemplares) {
        libroRepositorio.modificar(id, titulo, anio, autor, editorial, ejemplares);
    }

    @Transactional(readOnly = true)
    public List<Libro> buscarTodos() {
        return libroRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Libro buscarPorId(Integer id) {
        Optional<Libro> autorOptional = libroRepositorio.findById(id);
        return autorOptional.orElse(null);
    }

    @Transactional
    public void eliminar(Integer id) {
        libroRepositorio.deleteById(id);
    }
    @Transactional
    public void habilitar(Integer id, boolean flag) {
        libroRepositorio.habilitar(id, true);
    }
}
