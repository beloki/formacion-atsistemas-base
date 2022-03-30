package com.example.demojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpa.model.Pelicula;
import com.example.demojpa.service.PeliculaService;

@RestController
public class PeliculasController {

	@Autowired
	private PeliculaService peliculaService;

	@GetMapping(value = "peliculas", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pelicula> listarPeliculas() {
		return peliculaService.listarPeliculas();
	}

	@GetMapping(value = "peliculas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Pelicula listarPeliculas(@PathVariable Integer id) {
		return peliculaService.obtenerPelicula(id);
	}

	@PostMapping(value = "peliculas", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Pelicula crearPelicula(@RequestBody Pelicula pelicula) {
		pelicula.setId(null);
		return peliculaService.guardar(pelicula);
	}

	@PutMapping(value = "peliculas/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Pelicula actualizarPelicula(@PathVariable Integer id, @RequestBody Pelicula pelicula) {
		pelicula.setId(id);
		return peliculaService.guardar(pelicula);
	}

	@GetMapping(value = "peliculas/generos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pelicula> buscarPorGenero(@PathVariable(name = "id") String idGenero) {
		return peliculaService.buscarPorGenero(idGenero);
	}

	@GetMapping(value = "peliculas/siglo-21", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pelicula> buscarSiglo21() {
		return peliculaService.buscarSiglo21();
	}

	@GetMapping(value = "peliculas/fechaEstreno/{fechaEstreno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pelicula> buscarPorFechaEstreno(@PathVariable Integer fechaEstreno) {
		return peliculaService.buscarPorFechaEstreno(fechaEstreno);
	}
}
