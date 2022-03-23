package com.atsistemas.formacion.base.jpa.libros.service.repository;

import java.util.List;

import com.atsistemas.formacion.base.jpa.libros.model.Autor;

public interface AutorRepository {

	List<Autor> findAll();
	
	Autor findById(Integer id);

	Autor insert(Autor pelicula);

	Autor update(Autor pelicula);

}
