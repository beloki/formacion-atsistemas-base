package com.atsistemas.formacion.base.jpa.libros.service.repository;

import java.util.List;

import com.atsistemas.formacion.base.jpa.libros.model.Estanteria;

public interface EstanteriaRepository {

	List<Estanteria> findAll();

}
