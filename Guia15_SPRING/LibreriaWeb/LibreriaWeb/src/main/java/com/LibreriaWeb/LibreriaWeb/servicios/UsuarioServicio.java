package com.LibreriaWeb.LibreriaWeb.servicios;

import com.LibreriaWeb.LibreriaWeb.repositorios.UsuarioRepositorio;
import com.LibreriaWeb.LibreriaWeb.entidades.Usuario;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServicio implements UserDetailsService {

    private final String MSJ = "El usuario no existe %s";

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Transactional
    public void crear(String username, String pass) throws Exception{
      if(usuarioRepositorio.existsUsuarioByUsername(username)){
            throw new Exception("Ya existe ese nombre de usuario");
        }
        
        Usuario user = new Usuario();

        user.setUsername(username);
        user.setPass(encoder.encode(pass));
        user.setAlta(true);

        usuarioRepositorio.save(user);
    }

    @Transactional
    public void modificar(Integer id, String username) {
        usuarioRepositorio.modificar(id, username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.findByUsername(username).orElseThrow(()
                -> new UsernameNotFoundException(String.format(MSJ, username)));

        return new User(usuario.getUsername(), usuario.getPass(), Collections.emptyList());
    }

}
