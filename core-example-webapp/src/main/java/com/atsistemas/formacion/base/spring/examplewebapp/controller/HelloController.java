package com.atsistemas.formacion.base.spring.examplewebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.atsistemas.formacion.base.spring.examplewebapp.controller.service.HelloService;

@Controller
public class HelloController {

	private HelloService helloService;

	@Autowired
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	@GetMapping("/hello")
	public String handle(Model model) {
		model.addAttribute("message", helloService.sayHello());
		return "hello";
	}

	@GetMapping("/goodbye")
	public String metodo2(Model model) {
		model.addAttribute("nombre", "Chico");
		return "goodbye";
	}
}