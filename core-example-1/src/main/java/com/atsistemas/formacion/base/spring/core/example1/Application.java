package com.atsistemas.formacion.base.spring.core.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.formacion.base.spring.core.example1.config.Config;
import com.atsistemas.formacion.base.spring.core.example1.model.ITodo;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ITodo todo = context.getBean(ITodo.class);
		System.out.println(todo);
		context.close();
	}
}