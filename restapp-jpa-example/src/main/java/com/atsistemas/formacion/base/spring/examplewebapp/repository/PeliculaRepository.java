package com.atsistemas.formacion.base.spring.examplewebapp.repository;

import java.util.List;

import com.atsistemas.formacion.base.spring.examplewebapp.model.Pelicula;

public interface PeliculaRepository {

	List<Pelicula> findAll();

	Pelicula findById(Integer id);

	Pelicula insert(Pelicula pelicula);

	Pelicula update(Pelicula pelicula);

	void delete(Integer pelicula);

}
