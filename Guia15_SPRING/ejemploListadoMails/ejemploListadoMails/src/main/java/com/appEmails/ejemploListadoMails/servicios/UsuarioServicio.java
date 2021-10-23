package com.appEmails.ejemploListadoMails.servicios;

import com.appEmails.ejemploListadoMails.entidades.Usuario;
import com.appEmails.ejemploListadoMails.repositorios.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio repositorio;

    @Transactional
    public void crearUsuario(String nombre, String apellido, String correo) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);

        repositorio.save(usuario);
    }

    @Transactional
    public void modificarUsuario(Integer ID, String nombre, String apellido, String correo) {
        Usuario usuario = repositorio.findById(ID).get();

        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);

        repositorio.save(usuario);
    }

    @Transactional(readOnly = true)
    public List<Usuario> obtenerUsuarios() {
        return repositorio.findAll();
    }
}
