package com.atsistemas.formacion.base.jpa.bootspringdata.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Genero;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.GeneroService;

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
