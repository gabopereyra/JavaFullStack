package com.LibreriaWeb.LibreriaWeb.controladores;

import com.LibreriaWeb.LibreriaWeb.entidades.*;
import com.LibreriaWeb.LibreriaWeb.servicios.*;
import com.LibreriaWeb.LibreriaWeb.servicios.LibroServicio;
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
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private EditorialServicio editorialServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private LibroServicio libroServicio;

    @GetMapping
    public ModelAndView showAll() {
        ModelAndView mav = new ModelAndView("libros");
        mav.addObject("libros", libroServicio.buscarTodos());
        return mav;
    }

    @GetMapping("/crear")
    public ModelAndView crearLibro() {
        ModelAndView mav = new ModelAndView("libro-form");
        mav.addObject("title", "Crear libro");
        mav.addObject("libro", new Libro());
        mav.addObject("ISBN", "ISBN");
        mav.addObject("titulo", "titulo");
        mav.addObject("anio", "anio");
        mav.addObject("ejemplares", "ejemplares");
        mav.addObject("autor", autorServicio.buscarTodos());
        mav.addObject("editorial", editorialServicio.buscarTodos());
        mav.addObject("action", "guardar");
        return mav;
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editarLibro(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("libro-form");
        mav.addObject("libro", libroServicio.buscarPorId(id));
        mav.addObject("title", "Editar libro");
        mav.addObject("ISBN", "ISBN");
        mav.addObject("titulo", "titulo");
        mav.addObject("anio", "anio");
        mav.addObject("ejemplares", "ejemplares");
        mav.addObject("autor", autorServicio.buscarTodos());
        mav.addObject("editorial", editorialServicio.buscarTodos());
        mav.addObject("action", "modificar");
        return mav;
    }

    @PostMapping("/guardar")
    public RedirectView guardar(@RequestParam Long ISBN, @RequestParam String titulo, @RequestParam Integer anio,
            @RequestParam Integer ejemplares, @RequestParam("autor") Integer autorID, @RequestParam("editorial") Integer editorialID) {
        libroServicio.crear(ISBN, titulo, anio, ejemplares, autorID, editorialID);
        return new RedirectView("/libros");
    }

    @PostMapping("/modificar")
    public RedirectView modificar(@RequestParam Integer id, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Autor autor, @RequestParam Editorial editorial, @RequestParam Integer ejemplares) {
        libroServicio.modificar(id, titulo, anio, autor, editorial, ejemplares);
        return new RedirectView("/libros");
    }

    @PostMapping("/eliminar/{id}")
    public RedirectView eliminar(@PathVariable Integer id) {
        libroServicio.eliminar(id);
        return new RedirectView("/libros");
    }
}
