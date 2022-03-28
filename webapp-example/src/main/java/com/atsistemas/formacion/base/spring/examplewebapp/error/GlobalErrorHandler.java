package com.atsistemas.formacion.base.spring.examplewebapp.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalErrorHandler {

	@ExceptionHandler(RuntimeException.class)
	public ModelAndView handleRuntimeException(HttpServletRequest request, RuntimeException ex) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		modelAndView.addObject("exception", ex);
		return modelAndView;
	}

}
