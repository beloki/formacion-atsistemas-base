package com.atsistemas.formacion.base.spring.examplewebapp.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.atsistemas.formacion.base.spring.examplewebapp.model.Pelicula;
import com.atsistemas.formacion.base.spring.examplewebapp.repository.PeliculaRepository;

@Repository
public class JpaPeliculaRepository implements PeliculaRepository {

	@PersistenceContext
	private EntityManager em;

	public JpaPeliculaRepository() {
	}

	public List<Pelicula> findAll() {
		return em.createQuery("FROM Pelicula", Pelicula.class).getResultList();
	}

	@Override
	public Pelicula findById(Integer id) {
		return em.find(Pelicula.class, id);
	}

	@Override
	public Pelicula insert(Pelicula pelicula) {
		em.persist(pelicula);
		return pelicula;
	}

	@Override
	public Pelicula update(Pelicula pelicula) {
		em.merge(pelicula);
		return pelicula;
	}

	@Override
	public void delete(Integer id) {
		em.createQuery("DELETE FROM Pelicula WHERE id = ?1").setParameter(1, id).executeUpdate();
	}

}
