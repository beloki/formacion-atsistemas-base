package com.atsistemas.formacion.base.jpa.libros.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.libros.model.Autor;
import com.atsistemas.formacion.base.jpa.libros.service.AutorService;
import com.atsistemas.formacion.base.jpa.libros.service.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {

	private AutorRepository autorRepository;

	public AutorServiceImpl(AutorRepository autorRepository) {
		this.autorRepository = autorRepository;
	}

	@Override
	public List<Autor> listadoAutores() {
		return autorRepository.findAll();
	}

}
