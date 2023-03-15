package com.atsistemas.formacion.base.spring.examplewebapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BANDWIDTH_LIMIT_EXCEEDED, reason = "Error muy grave")
public class PeliculasException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PeliculasException(String message) {
		super(message);
	}
	
	public String getErrorCode() {
		return "";
	}

}
