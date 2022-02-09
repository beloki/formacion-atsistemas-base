package com.atsistemas.formacion.base.spring.core.example2.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.atsistemas.formacion.base.spring.core.example2.model.ITodo;
import com.atsistemas.formacion.base.spring.core.example2.model.Todo;

@Configuration
@ComponentScan(basePackages = { "com.atsistemas.formacion.base.spring.core.example2" })
public class Config {

	@Bean
	public ITodo getTodo() {
		ITodo todo = new Todo(0, "Spring DI");
		todo.setDone(false);
		todo.setDueDate(LocalDate.now());
		return todo;
	}

}