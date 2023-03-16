package com.atsistemas.formacion.base.jpa.bootspringdata.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Libro;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.LibroService;

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

	@GetMapping(value = "join", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> listarLibrosJoin() {
		return libroService.listadoLibrosJoin();
	}

	@GetMapping(value = "titulo/{titulo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> listarLibrosTitulo(@PathVariable(name = "titulo") String titulo) {
		return libroService.listadoPorTitulo(titulo);
	}

	@GetMapping(value = "autor/{autor}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> listarLibrosAutor(@PathVariable(name = "autor") String autor) {
		return libroService.listadoPorAutor(autor);
	}

	@GetMapping(value = "autorfetch/{autor}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> listarLibrosAutorFetch(@PathVariable(name = "autor") String autor) {
		return libroService.listadoPorAutorFetch(autor);
	}

}
