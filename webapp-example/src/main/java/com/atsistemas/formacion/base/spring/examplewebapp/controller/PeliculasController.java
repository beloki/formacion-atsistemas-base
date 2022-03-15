package com.atsistemas.formacion.base.spring.examplewebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atsistemas.formacion.base.spring.examplewebapp.model.Pelicula;
import com.atsistemas.formacion.base.spring.examplewebapp.service.PeliculasService;

@Controller
public class PeliculasController {

	private PeliculasService peliculasService;

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

	@RequestMapping(value = "/nueva-pelicula", method = RequestMethod.GET)
	public ModelAndView nuevaPelicula() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("detallePelicula");
		modelAndView.addObject("pelicula", new Pelicula());
		return modelAndView;
	}

}
