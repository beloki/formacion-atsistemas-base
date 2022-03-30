package com.atsistemas.formacion.base.jpa.libros.service.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.atsistemas.formacion.base.jpa.libros.model.Libro;
import com.atsistemas.formacion.base.jpa.libros.service.repository.LibroRepository;

@Repository
public class JpaLibroRepository implements LibroRepository {

	@PersistenceContext
	private EntityManager em;

	public JpaLibroRepository() {
	}

	@Override
	public List<Libro> findAll() {
		return em.createQuery("FROM Libro", Libro.class).getResultList();
	}

	@Override
	public List<Libro> findAllJoin() {
		return em.createQuery("FROM Libro l JOIN FETCH l.autor", Libro.class).getResultList();
	}

}
