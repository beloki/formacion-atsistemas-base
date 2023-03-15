package com.atsistemas.formacion.base.spring.examplewebapp.error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.atsistemas.formacion.base.spring.examplewebapp.model.Error;

@ControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = PeliculasException.class)
	public ResponseEntity<Object> handlePeliculasException(PeliculasException ex) {
		return new ResponseEntity<>(new Error("SSSS", ex.getMessage()), HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);

	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		BindingResult bindingResult = ex.getBindingResult();
		return new ResponseEntity<Object>(
				new Error("VALIDATION_ERROR", bindingResult.getAllErrors().get(0).getDefaultMessage()),
				HttpStatus.BAD_REQUEST);
	}

}
