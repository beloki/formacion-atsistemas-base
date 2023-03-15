package com.atsistemas.formacion.base.spring.examplewebapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalErrorHandler {

	@ExceptionHandler(Throwable.class)
	public ModelAndView handleError(HttpServletRequest req, Throwable ex) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", ex);
		mav.setViewName("error");
		return mav;
	}

}
