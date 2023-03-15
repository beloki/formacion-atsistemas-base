package com.atsistemas.formacion.base.jpa.libros.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.libros.model.Estanteria;
import com.atsistemas.formacion.base.jpa.libros.service.EstanteriaService;
import com.atsistemas.formacion.base.jpa.libros.service.repository.EstanteriaRepository;

@Service
public class EstanteriaServiceImpl implements EstanteriaService {

	private EstanteriaRepository estanteriaRepository;

	public EstanteriaServiceImpl(EstanteriaRepository libroRepository) {
		this.estanteriaRepository = libroRepository;
	}

	@Override
	public List<Estanteria> listadoEstanterias() {
		return estanteriaRepository.findAll();
	}

}
