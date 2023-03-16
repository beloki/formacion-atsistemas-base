package com.atsistemas.formacion.base.jpa.bootspringdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PASILLOS")
public class Pasillo {

	@Id
	@Column(name = "codigo_pasillo")
	private String codigoPasillo;
	@Column(name = "nombre")
	private String nombre;

	public Pasillo() {
	}

	/**
	 * @return the codigoPasillo
	 */
	public String getCodigoPasillo() {
		return codigoPasillo;
	}

	/**
	 * @param codigoPasillo the codigoPasillo to set
	 */
	public void setCodigoPasillo(String codigoPasillo) {
		this.codigoPasillo = codigoPasillo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
