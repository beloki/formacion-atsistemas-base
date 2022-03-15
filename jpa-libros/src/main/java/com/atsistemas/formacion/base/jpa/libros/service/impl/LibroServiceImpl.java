package com.atsistemas.formacion.base.jpa.libros.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.libros.model.Libro;
import com.atsistemas.formacion.base.jpa.libros.service.LibroService;
import com.atsistemas.formacion.base.jpa.libros.service.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	private LibroRepository libroRepository;

	public LibroServiceImpl(LibroRepository libroRepository) {
		this.libroRepository = libroRepository;
	}

	@Override
	public List<Libro> listadoLibros() {
		return libroRepository.findAll();
	}

}
