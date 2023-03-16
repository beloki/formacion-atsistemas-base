package com.atsistemas.formacion.base.jpa.bootspringdata.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EstanteriaPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9106566902941439762L;

	@Column(name = "codigo_pasillo")
	private String codigoPasillo;
	@Column(name = "codigo_estanteria")
	private String codigoEstanteria;

	public EstanteriaPk() {
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
	 * @return the codigoEstanteria
	 */
	public String getCodigoEstanteria() {
		return codigoEstanteria;
	}

	/**
	 * @param codigoEstanteria the codigoEstanteria to set
	 */
	public void setCodigoEstanteria(String codigoEstanteria) {
		this.codigoEstanteria = codigoEstanteria;
	}

}
