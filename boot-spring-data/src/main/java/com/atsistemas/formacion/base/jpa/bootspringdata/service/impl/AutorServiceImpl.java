package com.atsistemas.formacion.base.jpa.bootspringdata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Autor;
import com.atsistemas.formacion.base.jpa.bootspringdata.repository.AutorRepository;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.AutorService;

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
