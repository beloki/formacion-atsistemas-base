package com.atsistemas.formacion.base.jpa.bootspringdata.mapper;

import org.springframework.stereotype.Component;

import com.atsistemas.formacion.base.jpa.bootspringdata.dto.PeliculaDto;
import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Pelicula;

@Component
public class PeliculaMapper {

	public PeliculaDto mapToDto(Pelicula pelicula) {
		return new PeliculaDto(pelicula.getId(), pelicula.getTitulo(), pelicula.getDirector(), pelicula.getGenero(),
				pelicula.getFechaEstreno());
	}

	public Pelicula mapToEntity(PeliculaDto pelicula) {
		return new Pelicula(pelicula.getId(), pelicula.getTitulo(), pelicula.getDirector(), pelicula.getGenero(),
				pelicula.getFechaEstreno());
	}

}
