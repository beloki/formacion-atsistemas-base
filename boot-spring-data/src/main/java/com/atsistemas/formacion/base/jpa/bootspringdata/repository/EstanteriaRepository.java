package com.atsistemas.formacion.base.jpa.bootspringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Estanteria;
import com.atsistemas.formacion.base.jpa.bootspringdata.entity.EstanteriaPk;

public interface EstanteriaRepository extends JpaRepository<Estanteria, EstanteriaPk>{


}
