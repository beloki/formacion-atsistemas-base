package com.atsistemas.formacion.base.jpa.libros.service.repository;

import java.util.List;

import com.atsistemas.formacion.base.jpa.libros.model.Libro;

public interface LibroRepository {

	List<Libro> findAll();

	List<Libro> findAllJoin();

}
