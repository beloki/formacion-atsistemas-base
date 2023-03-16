package com.atsistemas.formacion.base.jpa.bootspringdata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Genero;
import com.atsistemas.formacion.base.jpa.bootspringdata.repository.GeneroRepository;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.GeneroService;

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
