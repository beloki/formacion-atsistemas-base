package com.atsistemas.formacion.base.jpa.bootspringdata.service.impl;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.DataAccessException;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Pelicula;
import com.atsistemas.formacion.base.jpa.bootspringdata.repository.PeliculaRepository;

@ExtendWith(MockitoExtension.class)
public class PeliculaServiceImplTest {

	private PeliculaServiceImpl peliculaServiceImpl;

	@Mock
	private PeliculaRepository peliculaRepositoryMock;

	@BeforeEach
	public void setup() {
		this.peliculaServiceImpl = new PeliculaServiceImpl(peliculaRepositoryMock);
	}

	@Test
	public void testListarPeliculas() {
		Mockito.when(peliculaRepositoryMock.findAll()).thenReturn(
				List.of(new Pelicula(1, "Test", "Test", "Test", 2000), new Pelicula(2, "Test", "Test", "Test", 2000)));

		List<Pelicula> listarPeliculas = peliculaServiceImpl.listarPeliculas();

		Assertions.assertNotNull(listarPeliculas);
		Assertions.assertTrue(listarPeliculas.size() > 0);
		Assertions.assertEquals(2, listarPeliculas.size());

		Mockito.verify(peliculaRepositoryMock).findAll();
		Mockito.verifyNoMoreInteractions(peliculaRepositoryMock);
	}

	@Test
	public void testListarPeliculasError() {
		Mockito.when(peliculaRepositoryMock.findAll()).thenThrow(new DataAccessException("Error!") {
			private static final long serialVersionUID = 1L;
		});

		Assertions.assertThrows(DataAccessException.class, () -> peliculaServiceImpl.listarPeliculas());

		Mockito.verify(peliculaRepositoryMock).findAll();
		Mockito.verifyNoMoreInteractions(peliculaRepositoryMock);
	}

	@Test
	public void testFindPelicula() {
		Mockito.when(peliculaRepositoryMock.findById(1))
				.thenReturn(Optional.of(new Pelicula(1, "Test", "Test", "Test", 2000)));

		Pelicula pelicula = peliculaServiceImpl.buscarPelicula(1);

		Assertions.assertNotNull(pelicula);
		Assertions.assertEquals(1, pelicula.getId());

		Mockito.verify(peliculaRepositoryMock).findById(Mockito.any());
		Mockito.verifyNoMoreInteractions(peliculaRepositoryMock);
	}

}
