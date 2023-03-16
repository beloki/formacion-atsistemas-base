package com.atsistemas.formacion.base.jpa.bootspringdata.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Estanteria;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.EstanteriaService;

@RestController
@RequestMapping("estanterias")
public class EstanteriaController {

	private EstanteriaService estanteriaService;

	public EstanteriaController(EstanteriaService libroService) {
		this.estanteriaService = libroService;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Estanteria> listarLibros() {
		return estanteriaService.listadoEstanterias();
	}

}