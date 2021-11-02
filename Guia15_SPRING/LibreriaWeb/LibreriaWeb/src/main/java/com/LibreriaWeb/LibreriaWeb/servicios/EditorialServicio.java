package com.LibreriaWeb.LibreriaWeb.servicios;

import com.LibreriaWeb.LibreriaWeb.repositorios.EditorialRepositorio;
import com.LibreriaWeb.LibreriaWeb.entidades.Editorial;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crear(String nombre) {
        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);
        editorial.setAlta(true);

        editorialRepositorio.save(editorial);
    }

    @Transactional
    public void modificar(Integer id, String nombre) {
        editorialRepositorio.modificar(id, nombre);
    }

    @Transactional(readOnly = true)
    public List<Editorial> buscarTodos() {
        return editorialRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Editorial buscarPorId(Integer id) {
        Optional<Editorial> autorOptional = editorialRepositorio.findById(id);
        return autorOptional.orElse(null);
    }

    @Transactional
    public void eliminar(Integer id) {
        editorialRepositorio.deleteById(id);
    }
    @Transactional
    public void habilitar(Integer id, boolean flag) {
        editorialRepositorio.habilitar(id, true);
    }
}
  

