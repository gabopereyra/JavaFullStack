package com.LibreriaWeb.LibreriaWeb.controladores;

import com.LibreriaWeb.LibreriaWeb.entidades.Editorial;
import com.LibreriaWeb.LibreriaWeb.servicios.EditorialServicio;
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
@RequestMapping("/editoriales")
public class EditorialController {

    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping
    public ModelAndView showAll() {
        ModelAndView mav = new ModelAndView("editoriales");
        mav.addObject("editoriales", editorialServicio.buscarTodos());
        return mav;
    }

    @GetMapping("/crear")
    public ModelAndView createEditorial() {
        ModelAndView mav = new ModelAndView("editorial-form");
        mav.addObject("nombre", new Editorial());
        mav.addObject("title", "Crear editorial");
        mav.addObject("action", "guardar");
        return mav;
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editarUsuario(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("editorial-form");
        mav.addObject("editorial", editorialServicio.buscarPorId(id));
        mav.addObject("nombre", "Editar editorial");
        mav.addObject("action", "modificar");
        return mav;
    }

    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam String nombre) {
        editorialServicio.crear(nombre);
        return new RedirectView("/editoriales");
    }

    @PostMapping("/modificar")
    public RedirectView modificar(@RequestParam Integer id, @RequestParam String nombre) {
        editorialServicio.modificar(id, nombre);
        return new RedirectView("/editorial");
    }

    @PostMapping("/eliminar/{id}")
    public RedirectView eliminar(@PathVariable Integer id) {
        editorialServicio.eliminar(id);
        return new RedirectView("/editorial");
    }
}
