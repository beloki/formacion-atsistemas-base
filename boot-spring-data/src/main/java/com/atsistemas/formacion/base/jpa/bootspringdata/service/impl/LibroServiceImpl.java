package com.atsistemas.formacion.base.jpa.bootspringdata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Libro;
import com.atsistemas.formacion.base.jpa.bootspringdata.repository.LibroRepository;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.LibroService;

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

	@Override
	public List<Libro> listadoLibrosJoin() {
		return libroRepository.findAllJoin();
	}

	@Override
	public List<Libro> listadoPorTitulo(String titulo) {
		return libroRepository.findByTituloLike(titulo);
	}

	@Override
	public List<Libro> listadoPorAutor(String nombre) {
		return libroRepository.findByAutorNombreContains(nombre);
	}

	@Override
	public List<Libro> listadoPorAutorFetch(String nombre) {
		return libroRepository.findByAutorJoinFetch(nombre);
	}

}
