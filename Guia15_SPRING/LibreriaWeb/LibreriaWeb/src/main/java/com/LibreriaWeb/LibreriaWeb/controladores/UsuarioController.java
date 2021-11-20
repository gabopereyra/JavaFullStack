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
import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.support.RequestContextUtils;
import java.util.Map;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/login")
public class UsuarioController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping
    public ModelAndView login(@RequestParam(required = false) String error, @RequestParam(required = false) String logout, Principal principal) {
        ModelAndView mav = new ModelAndView("login");

        if (error != null) {
            mav.addObject("error", "Usuario y/o contraseña invalidos");
        }

        if (logout != null) {
            mav.addObject("logout", "Ha salido correctamente");
        }

        if (principal != null) {
            mav.setViewName("redirect:/");
        }

        return mav;
    }

    @GetMapping("/crear")
    public ModelAndView createUsuario(HttpServletRequest request, Principal principal) {
        ModelAndView mav = new ModelAndView("usuario-form");
        Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);

        if (flashMap != null) {
            mav.addObject("error", flashMap.get("error"));
            mav.addObject("exito", flashMap.get("exito"));
            mav.addObject("action", flashMap.get("guardar"));
            mav.addObject("username", flashMap.get("username"));
            mav.addObject("password", flashMap.get("password"));
        }

        if (principal != null) {
            mav.setViewName("redirect:/");
        }

        return mav;
    }

    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam String username, @RequestParam String password, RedirectAttributes attributes) throws Exception {
        RedirectView redirectView = new RedirectView("/login");
        try {
            usuarioServicio.crear(username, password);
            
            attributes.addFlashAttribute("exito", "¡Se ha registrado con éxito!");
        } catch (Exception e) {
            attributes.addFlashAttribute("error", e.getMessage());
            attributes.addFlashAttribute("username", username);
            attributes.addFlashAttribute("password", password);
            
            redirectView.setUrl("/login/crear");
        }

        return redirectView;
    }

}
