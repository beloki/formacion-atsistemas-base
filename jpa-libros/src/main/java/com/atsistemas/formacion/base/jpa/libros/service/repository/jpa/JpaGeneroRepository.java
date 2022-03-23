package com.atsistemas.formacion.base.jpa.libros.service.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.atsistemas.formacion.base.jpa.libros.model.Genero;
import com.atsistemas.formacion.base.jpa.libros.service.repository.GeneroRepository;

@Repository
public class JpaGeneroRepository implements GeneroRepository {

	@PersistenceContext
	private EntityManager em;

	public JpaGeneroRepository() {
	}

	@Override
	public List<Genero> findAll() {
		return em.createQuery("FROM Genero", Genero.class).getResultList();
	}

}
