package com.atsistemas.formacion.base.spring.core.example3.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.atsistemas.formacion.base.spring.core.example3" })
public class Config {

	@Bean
	public Long getId() {
		return Long.valueOf(1);
	}

	@Bean
	public String getSummary() {
		return "Spring DI";
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