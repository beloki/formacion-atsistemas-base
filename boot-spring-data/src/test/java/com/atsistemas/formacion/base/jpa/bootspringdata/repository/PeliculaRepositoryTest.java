package com.atsistemas.formacion.base.jpa.bootspringdata.repository;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Pelicula;

@DataJpaTest
public class PeliculaRepositoryTest {

	@Autowired
	private PeliculaRepository peliculaRepository;

	@Test
	public void testFindAll() {
		List<Pelicula> peliculas = peliculaRepository.findAll();
		Assertions.assertEquals(6, peliculas.size());
	}

}
