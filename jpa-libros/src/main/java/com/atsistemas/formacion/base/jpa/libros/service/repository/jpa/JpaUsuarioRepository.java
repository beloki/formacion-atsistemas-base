package com.atsistemas.formacion.base.jpa.libros.service.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.atsistemas.formacion.base.jpa.libros.model.Usuario;
import com.atsistemas.formacion.base.jpa.libros.service.repository.UsuarioRepository;

@Repository
public class JpaUsuarioRepository implements UsuarioRepository {

	@PersistenceContext
	private EntityManager em;

	public JpaUsuarioRepository() {
	}

	@Override
	public List<Usuario> findAll() {
		return em.createQuery("FROM Usuario", Usuario.class).getResultList();
	}

}
