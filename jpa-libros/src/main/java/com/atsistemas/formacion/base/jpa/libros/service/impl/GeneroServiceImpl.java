package com.atsistemas.formacion.base.jpa.libros.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.libros.model.Genero;
import com.atsistemas.formacion.base.jpa.libros.service.GeneroService;
import com.atsistemas.formacion.base.jpa.libros.service.repository.GeneroRepository;

@Service
public class GeneroServiceImpl implements GeneroService {

	private GeneroRepository generoRepository;

	public GeneroServiceImpl(GeneroRepository generoRepository) {
		this.generoRepository = generoRepository;
	}

	@Override
	public List<Genero> listadoGeneros() {
		return generoRepository.findAll();
	}

}
