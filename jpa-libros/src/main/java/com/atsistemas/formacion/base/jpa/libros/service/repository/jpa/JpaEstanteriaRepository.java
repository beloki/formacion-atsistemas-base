package com.atsistemas.formacion.base.jpa.libros.service.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.atsistemas.formacion.base.jpa.libros.model.Estanteria;
import com.atsistemas.formacion.base.jpa.libros.service.repository.EstanteriaRepository;

@Repository
public class JpaEstanteriaRepository implements EstanteriaRepository {

	@PersistenceContext
	private EntityManager em;

	public JpaEstanteriaRepository() {
	}

	@Override
	public List<Estanteria> findAll() {
		return em.createQuery("FROM Estanteria", Estanteria.class).getResultList();
	}

}
