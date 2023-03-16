package com.atsistemas.formacion.base.jpa.bootspringdata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Estanteria;
import com.atsistemas.formacion.base.jpa.bootspringdata.repository.EstanteriaRepository;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.EstanteriaService;

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
