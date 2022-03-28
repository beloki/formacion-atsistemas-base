package com.atsistemas.formacion.base.spring.examplewebapp.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Pelicula {

	private Integer id;

	@NotEmpty
	private String titulo;
	@NotEmpty
	private String director;
	@NotEmpty
	private String genero;
	@NotEmpty(message = "")
	@Size(min = 4, max = 4, message = "")
	private String fechaEstreno;

	public Pelicula() {
		super();
	}

	public Pelicula(Integer id, String titulo, String director, String genero, String fechaEstreno) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.fechaEstreno = fechaEstreno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(String fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

}
