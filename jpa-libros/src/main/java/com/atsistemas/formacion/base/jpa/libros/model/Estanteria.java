package com.atsistemas.formacion.base.jpa.libros.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "ESTANTERIAS")
//@IdClass(value = EstanteriaPk.class)
public class Estanteria {

//	@Id
//	@Column(name = "codigo_pasillo")
//	private String codigoPasillo;
//	@Id
//	@Column(name = "codigo_estanteria")
//	private String codigoEstanteria;
	@Id
	private EstanteriaPk id;
	@Column(name = "nombre")
	private String nombre;

	public Estanteria() {
	}

//	/**
//	 * @return the codigoPasillo
//	 */
//	public String getCodigoPasillo() {
//		return codigoPasillo;
//	}
//
//	/**
//	 * @param codigoPasillo the codigoPasillo to set
//	 */
//	public void setCodigoPasillo(String codigoPasillo) {
//		this.codigoPasillo = codigoPasillo;
//	}
//
//	/**
//	 * @return the codigoEstanteria
//	 */
//	public String getCodigoEstanteria() {
//		return codigoEstanteria;
//	}
//
//	/**
//	 * @param codigoEstanteria the codigoEstanteria to set
//	 */
//	public void setCodigoEstanteria(String codigoEstanteria) {
//		this.codigoEstanteria = codigoEstanteria;
//	}

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

	/**
	 * @return the id
	 */
	public EstanteriaPk getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(EstanteriaPk id) {
		this.id = id;
	}

}
