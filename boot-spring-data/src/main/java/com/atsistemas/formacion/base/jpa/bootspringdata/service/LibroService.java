package com.atsistemas.formacion.base.jpa.bootspringdata.service;

import java.util.List;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Libro;

public interface LibroService {

	List<Libro> listadoLibros();

	List<Libro> listadoLibrosJoin();

	List<Libro> listadoPorTitulo(String titulo);

	List<Libro> listadoPorAutor(String nombre);

	List<Libro> listadoPorAutorFetch(String nombre);
	
}
