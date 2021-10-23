package com.appEmails.ejemploListadoMails.controladores;

import com.appEmails.ejemploListadoMails.entidades.*;
import com.appEmails.ejemploListadoMails.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/usuarios")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio servicio;
    
    @GetMapping("/todos")
    public ModelAndView mostrarUsuarios(){
        ModelAndView mav= new ModelAndView("usuarios-lista");
        List<Usuario> usuarios= servicio.obtenerUsuarios();
        mav.addObject("usuarios", usuarios);
        
        return mav;
    }
}
