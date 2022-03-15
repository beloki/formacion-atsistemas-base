package com.atsistemas.formacion.base.jpa.libros.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.jpa.libros.model.Genero;
import com.atsistemas.formacion.base.jpa.libros.service.GeneroService;

@RestController
@RequestMapping("generos")
public class GeneroController {

	private GeneroService generoService;

	public GeneroController(GeneroService generoService) {
		this.generoService = generoService;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Genero> listarGeneros() {
		return generoService.listadoGeneros();
	}

}
