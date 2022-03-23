package com.atsistemas.formacion.base.jpa.libros.service.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.atsistemas.formacion.base.jpa.libros.model.Autor;
import com.atsistemas.formacion.base.jpa.libros.service.repository.AutorRepository;

@Repository
public class JpaAutorRepository implements AutorRepository {

	@PersistenceContext
	private EntityManager em;

	public JpaAutorRepository() {
	}

	@Override
	public List<Autor> findAll() {
		return em.createQuery("FROM Autor", Autor.class).getResultList();
	}

	@Override
	public Autor findById(Integer id) {
		return em.find(Autor.class, id);
	}

	@Override
	public Autor insert(Autor pelicula) {
		em.persist(pelicula);
		return pelicula;
	}

	@Override
	public Autor update(Autor pelicula) {
		em.merge(pelicula);
		return pelicula;
	}

}
