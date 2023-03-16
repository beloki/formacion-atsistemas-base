package com.atsistemas.formacion.base.jpa.bootspringdata.service.impl;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl {

	public String hello(String name) {

		if (name != null)
			return "Hello " + name;
		else
			throw new RuntimeException("Error!");
	}

}
