package com.LibreriaWeb.LibreriaWeb.controladores;

import com.LibreriaWeb.LibreriaWeb.entidades.Autor;
import com.LibreriaWeb.LibreriaWeb.servicios.AutorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorServicio autorServicio;

    @GetMapping
    public ModelAndView showAll() {
        ModelAndView mav = new ModelAndView("autores");
        mav.addObject("autores", autorServicio.buscarTodos());
        return mav;
    }

    @GetMapping("/crear")
    public ModelAndView createAutor() {
        ModelAndView mav = new ModelAndView("autor-form");
        mav.addObject("autor", new Autor());
        mav.addObject("title", "Crear autor");
        mav.addObject("action", "guardar");
        return mav;
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editarUsuario(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("autor-form");
        mav.addObject("autor", autorServicio.buscarPorId(id));
        mav.addObject("nombre", "Editar autor");
        mav.addObject("action", "modificar");
        return mav;
    }

    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam String nombre) {
        autorServicio.crear(nombre);
        return new RedirectView("/autores");
    }

    @PostMapping("/modificar")
    public RedirectView modificar(@RequestParam Integer id, @RequestParam String nombre) {
        autorServicio.modificar(id, nombre);
        return new RedirectView("/autores");
    }

    @PostMapping("/eliminar/{id}")
    public RedirectView eliminar(@PathVariable Integer id) {
        autorServicio.eliminar(id);
        return new RedirectView("/autores");
    }
    @PostMapping("/habilitar/{id}")
    public RedirectView habilitar(@PathVariable Integer id, boolean flag) {
        autorServicio.habilitar(id, flag);
        return new RedirectView("/autores");
    }
    
}
