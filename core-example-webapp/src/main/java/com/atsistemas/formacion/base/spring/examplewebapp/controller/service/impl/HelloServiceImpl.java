package com.atsistemas.formacion.base.spring.examplewebapp.controller.service.impl;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.spring.examplewebapp.controller.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		return "Hello World!";
	}

}
