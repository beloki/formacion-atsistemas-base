package com.atsistemas.formacion.base.jpa.bootspringdata.dto;

public class PeliculaDto {

	private Integer id;
	private String titulo;
	private String director;
	private String genero;
	private Integer fechaEstreno;

	public PeliculaDto(Integer id, String titulo, String director, String genero, Integer fechaEstreno) {
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

	public Integer getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(Integer fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

}
