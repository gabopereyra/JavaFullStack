/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibreriaWeb.LibreriaWeb.controladores;

import com.LibreriaWeb.LibreriaWeb.servicios.UsuarioServicio;
import com.LibreriaWeb.LibreriaWeb.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/usuario-form")
public class UsuarioController {
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @GetMapping
    public ModelAndView createUsuario() {
        ModelAndView mav = new ModelAndView("usuario-form");
        mav.addObject("usuario", new Usuario());
        mav.addObject("title", "Crear usuario");
        mav.addObject("action", "guardar");
        return mav;
    }
    
    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam String username, @RequestParam String pass) {
        usuarioServicio.crear(username, pass);
        return new RedirectView("/login");
    }
        
}
