package com.atsistemas.formacion.base.jpa.bootspringdata.service;

import java.util.List;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Pelicula;

public interface PeliculaService {

	List<Pelicula> listarPeliculas();

	Pelicula buscarPelicula(Integer id);

	Pelicula guardarPelicula(Pelicula pelicula);

	void eliminarPelicula(Integer idPelicula);

	List<Pelicula> buscarPeliculaGenero(String genero);

	List<Pelicula> buscarPeliculaFechaEstreno(Integer fecha);

	List<Pelicula> buscarPeliculasSiglo21();

	List<Pelicula> buscarPeliculas(String titulo, String director, Integer fechaEstreno, String genero);

}
