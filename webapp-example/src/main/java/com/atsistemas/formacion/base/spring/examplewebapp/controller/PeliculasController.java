package com.atsistemas.formacion.base.spring.examplewebapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atsistemas.formacion.base.spring.examplewebapp.model.Pelicula;
import com.atsistemas.formacion.base.spring.examplewebapp.service.PeliculasService;

@Controller
public class PeliculasController {

	private PeliculasService peliculasService;

	@Autowired
	public PeliculasController(PeliculasService peliculasService) {
		this.peliculasService = peliculasService;
	}

	@RequestMapping(value = "/listado-peliculas", method = RequestMethod.GET)
	public ModelAndView listadoPeliculas() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("listadoPeliculas");
		modelAndView.addObject("peliculas", peliculasService.listarPeliculas());
		return modelAndView;
	}

	// Otra forma de usar la vista y el modelo
//	@RequestMapping(value = "/listado-peliculas", method = RequestMethod.GET)
//	public String listadoPeliculas(Model model) {
//		model.addAttribute("peliculas", peliculasService.listarPeliculas());
//		return "listadoPeliculas";
//	}

	@RequestMapping(value = "/nueva-pelicula", method = RequestMethod.GET)
	public ModelAndView nuevaPelicula() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("detallePelicula");
		modelAndView.addObject("pelicula", new Pelicula());
		return modelAndView;
	}

	@RequestMapping(value = "/llamada-con-error", method = RequestMethod.GET)
	public ModelAndView llamadaConError() {
		throw new RuntimeException("ERROR");
	}

	@RequestMapping(value = "/modificar-pelicula", method = RequestMethod.GET)
	public ModelAndView detallePelicula(@RequestParam("idPelicula") Integer idPelicula) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("detallePelicula");
		Pelicula pelicula = peliculasService.buscarPelicula(idPelicula);
		modelAndView.addObject("pelicula", pelicula);
		return modelAndView;
	}

	@RequestMapping(value = "/guardar-pelicula", method = RequestMethod.POST)
	public ModelAndView guardarPelicula(@ModelAttribute(name = "pelicula") @Valid Pelicula pelicula,
			BindingResult errors) {
		ModelAndView modelAndView = new ModelAndView();
		if (errors.hasErrors()) {
			modelAndView.setViewName("detallePelicula");
			modelAndView.addObject("pelicula", pelicula);
		} else {
			peliculasService.guardarPelicula(pelicula);
			modelAndView.setViewName("listadoPeliculas");
			modelAndView.addObject("peliculas", peliculasService.listarPeliculas());
		}
		return modelAndView;
	}

	@RequestMapping(value = "/eliminar-pelicula", method = RequestMethod.DELETE)
	public @ResponseBody void eliminarPelicula(@RequestParam("idPelicula") Integer idPelicula) {
		peliculasService.eliminarPelicula(idPelicula);
	}

	@ExceptionHandler(RuntimeException.class)
	public ModelAndView pantallaError(HttpServletRequest request, RuntimeException ex) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		modelAndView.addObject("exception", ex);
		return modelAndView;
	}

}
