package com.atsistemas.formacion.base.jpa.bootspringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

	}
