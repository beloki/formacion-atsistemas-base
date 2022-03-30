package com.example.demojpa.service;

import java.util.List;

import com.example.demojpa.model.Pelicula;

public interface PeliculaService {

	List<Pelicula> listarPeliculas();

	Pelicula obtenerPelicula(Integer id);

	Pelicula guardar(Pelicula pelicula);

	List<Pelicula> buscarPorGenero(String genero);

	List<Pelicula> buscarSiglo21();

	List<Pelicula> buscarPorFechaEstreno(Integer fechaEstreno);

}
