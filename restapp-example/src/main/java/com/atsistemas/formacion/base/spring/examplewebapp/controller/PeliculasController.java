package com.atsistemas.formacion.base.spring.examplewebapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.spring.examplewebapp.model.Pelicula;
import com.atsistemas.formacion.base.spring.examplewebapp.service.PeliculasService;

@RestController
public class PeliculasController {

	private PeliculasService peliculasService;

	public PeliculasController(PeliculasService peliculasService) {
		this.peliculasService = peliculasService;
	}

	@GetMapping(value = "/peliculas", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public List<Pelicula> listadoPeliculas() {
		return peliculasService.listarPeliculas();
	}

	@GetMapping(value = "/peliculas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pelicula> obtenerPelicula(@PathVariable(name = "id") Integer id) {
		Pelicula pelicula = peliculasService.buscarPelicula(id);
		if (pelicula != null) {
			return ResponseEntity.status(HttpStatus.OK).body(pelicula);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@PostMapping(value = "/peliculas", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Pelicula crearPelicula(@RequestBody Pelicula pelicula) {
		peliculasService.guardarPelicula(pelicula);
		return pelicula;
	}

	@PutMapping(value = "/peliculas/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void modificarPelicula(@PathVariable(name = "id") Integer id, @RequestBody Pelicula pelicula) {
		pelicula.setId(id);
		peliculasService.guardarPelicula(pelicula);
	}

	@DeleteMapping(value = "/peliculas/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void eliminarPelicula(@PathVariable(name = "id") Integer id) {
		peliculasService.eliminarPelicula(id);
	}

}
