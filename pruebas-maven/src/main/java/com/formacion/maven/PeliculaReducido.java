package com.formacion.maven;

public class PeliculaReducido {
	private String titulo;
	private String director;

	public PeliculaReducido(String titulo, String director) {
		super();
		this.titulo = titulo;
		this.director = director;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

}
