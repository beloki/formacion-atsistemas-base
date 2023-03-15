package com.atsistemas.formacion.base.java.functionalprogramming.optional;

import java.util.Optional;

import com.atsistemas.formacion.base.java.functionalprogramming.model.Pelicula;
import com.atsistemas.formacion.base.java.functionalprogramming.model.PeliculaReducido;
import com.atsistemas.formacion.base.java.functionalprogramming.repository.PeliculaRepository;

public class OptionalMain {

	public static void main(String[] args) {
		PeliculaRepository repository = new PeliculaRepository();

		Optional<Pelicula> peliculaOpt = Optional.ofNullable(repository.buscarPelicula(100));
		PeliculaReducido peliculaReducido = peliculaOpt
				.map(p -> new PeliculaReducido(p.getTitulo(), "Director-" + p.getDirector()))
//				.map(PeliculaReducido::getDirector)
//				.filter(pr -> pr.getTitulo().contains("Alien"))
//				.orElseThrow(() -> new RuntimeException("ERROR!"));
				.orElseGet(() -> new PeliculaReducido("Ninguno", "Ninguno"));
		System.out.println(peliculaReducido.getDirector());
//
//		Pelicula pelicula = peliculaOpt.orElseGet(() -> new Pelicula());
//		Pelicula pelicula2 = peliculaOpt.orElse(new Pelicula());
//		Pelicula pelicula3 = peliculaOpt.orElseThrow(() -> new RuntimeException("ERROR"));

//		if (peliculaOpt.isPresent()) {
//			System.out.println("Titulo: " + peliculaOpt.get().getTitulo());
//		}

//		if (pelicula != null) {
//			System.out.println("Titulo: " + pelicula.getTitulo());
//		} else {
//			System.out.println("No hay pelicula 100");
//		}

	}

}
