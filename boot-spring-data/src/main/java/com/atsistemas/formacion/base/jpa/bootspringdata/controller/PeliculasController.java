package com.atsistemas.formacion.base.jpa.bootspringdata.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.jpa.bootspringdata.dto.PeliculaDto;
import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Pelicula;
import com.atsistemas.formacion.base.jpa.bootspringdata.mapper.PeliculaMapper;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.PeliculaService;

@RestController
public class PeliculasController {

	private PeliculaService peliculaService;
	private PeliculaMapper peliculaMapper;

	public PeliculasController(PeliculaService peliculaService, PeliculaMapper peliculaMapper) {
		this.peliculaService = peliculaService;
		this.peliculaMapper = peliculaMapper;
	}

	@GetMapping(value = "/peliculas", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PeliculaDto> listadoPeliculas() {
		List<Pelicula> listarPeliculas = peliculaService.listarPeliculas();
		return listarPeliculas.stream().map(peliculaMapper::mapToDto).collect(Collectors.toList());
	}

	@PostMapping(value = "/peliculas", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pelicula crearPelicula(@RequestBody Pelicula pelicula) {

		peliculaService.guardarPelicula(pelicula);

		return pelicula;
	}

	@GetMapping(value = "/peliculas/{idPelicula}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Pelicula obtenerPelicula(@PathVariable(value = "idPelicula") Integer idPelicula) {
		return peliculaService.buscarPelicula(idPelicula);
	}

	@PutMapping(value = "/peliculas/{idPelicula}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Pelicula modificarPelicula(@PathVariable(value = "idPelicula") Integer idPelicula,
			@RequestBody Pelicula pelicula) {
		pelicula.setId(idPelicula);
		peliculaService.guardarPelicula(pelicula);

		return pelicula;
	}

	@DeleteMapping(value = "/peliculas/{idPelicula}", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void eliminarPelicula(@PathVariable(value = "idPelicula") Integer idPelicula) {
		peliculaService.eliminarPelicula(idPelicula);

	}

	@GetMapping(value = "/peliculas/generos/{genero}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pelicula> obtenerPeliculasGenero(@PathVariable(value = "genero") String genero) {
		return peliculaService.buscarPeliculaGenero(genero);
	}

	@GetMapping(value = "/peliculas/fechaEstreno/{fecha}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pelicula> obtenerPeliculasFechaEstreno(@PathVariable(value = "fecha") Integer fecha) {
		return peliculaService.buscarPeliculaFechaEstreno(fecha);
	}

	@GetMapping(value = "/peliculas/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pelicula> buscarPeliculas(@RequestParam(name = "titulo", required = false) String titulo,
			@RequestParam(name = "director", required = false) String director,
			@RequestParam(name = "fechaEstreno", required = false) Integer fechaEstreno,
			@RequestParam(name = "genero", required = false) String genero) {
		return peliculaService.buscarPeliculas(titulo, director, fechaEstreno, genero);
	}

	@GetMapping(value = "/peliculas/21th", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pelicula> buscarPeliculasSiglo21() {
		return peliculaService.buscarPeliculasSiglo21();
	}

}
