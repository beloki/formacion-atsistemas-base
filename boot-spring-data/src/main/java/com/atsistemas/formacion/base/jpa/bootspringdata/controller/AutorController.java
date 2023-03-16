package com.atsistemas.formacion.base.jpa.bootspringdata.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Autor;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.AutorService;

@RestController
@RequestMapping("autores")
public class AutorController {

	private AutorService autorService;

	public AutorController(AutorService autorService) {
		this.autorService = autorService;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Autor> listarAutores() {
		return autorService.listadoAutores();
	}

}
