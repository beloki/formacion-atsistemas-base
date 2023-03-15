package com.atsistemas.formacion.base.java.functionalprogramming.streams;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.atsistemas.formacion.base.java.functionalprogramming.model.Pelicula;
import com.atsistemas.formacion.base.java.functionalprogramming.repository.PeliculaRepository;

public class StreamExercices {

	public static void main(String[] args) {
		PeliculaRepository peliculaRepository = new PeliculaRepository();

		Collection<Pelicula> peliculas = peliculaRepository.obtenerPeliculas();

		boolean anyMatch = peliculas.stream().map(Pelicula::getGenero).anyMatch("Accion"::equals);

		System.out.println("Existen peliculas de 'Accion': " + anyMatch);

		long count = peliculaRepository.obtenerPeliculas().stream().filter(p -> p.getFechaEstreno() < 2000).count();
		System.out.println("Películas del sigo XX: " + count);

		List<Pelicula> listadoPeliculas = peliculaRepository.obtenerPeliculas().stream().collect(Collectors.toList());

		System.out.println(listadoPeliculas);

		peliculaRepository.obtenerPeliculas().stream().filter(p -> p.getFechaEstreno() < 2000)
				.sorted(Comparator.comparing(Pelicula::getTitulo)).forEach(System.out::println);

		Double collect = peliculaRepository.obtenerPeliculas().stream().map(p -> 2023 - p.getFechaEstreno())
				.collect(Collectors.averagingDouble(i -> i));

		System.out.println("Media: " + collect);

		Map<String, List<Pelicula>> agrupacionPeliculasGenero = peliculaRepository.obtenerPeliculas().stream()
				.collect(Collectors.groupingBy(Pelicula::getGenero));
		
		System.out.println("Agrupacion peliculas genero:" + agrupacionPeliculasGenero);

	}
}
