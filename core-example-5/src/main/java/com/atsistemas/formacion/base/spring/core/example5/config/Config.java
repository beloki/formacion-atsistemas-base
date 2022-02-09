package com.atsistemas.formacion.base.spring.core.example5.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.atsistemas.formacion.base.spring.core.example5" })
public class Config {

	@Bean
	public Long getId() {
		return Long.valueOf(1);
	}

	@Bean("summary")
	public String getSummary() {
		return "Spring DI";
	}

	@Bean("description")
	public String getDescription() {
		return "Dependency in Spring is a powerful feauture for inversion of control.";
	}

	@Bean
	public Boolean isDone() {
		return Boolean.FALSE;
	}

	@Bean
	public LocalDate getDueDate() {
		return LocalDate.now();
	}
}