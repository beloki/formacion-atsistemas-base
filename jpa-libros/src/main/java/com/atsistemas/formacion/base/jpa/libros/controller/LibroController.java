package com.atsistemas.formacion.base.jpa.libros.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.jpa.libros.model.Libro;
import com.atsistemas.formacion.base.jpa.libros.service.LibroService;

@RestController
@RequestMapping("libros")
public class LibroController {

	private LibroService libroService;

	public LibroController(LibroService libroService) {
		this.libroService = libroService;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> listarLibros() {
		return libroService.listadoLibros();
	}

}
