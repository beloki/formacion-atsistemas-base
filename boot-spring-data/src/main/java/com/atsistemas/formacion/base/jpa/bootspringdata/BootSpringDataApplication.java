package com.atsistemas.formacion.base.jpa.bootspringdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@SpringBootApplication
public class BootSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSpringDataApplication.class, args);
	}

	@Bean
	public Hibernate5Module hibernateModule() {
		Hibernate5Module module = new Hibernate5Module();
		module.disable(Hibernate5Module.Feature.USE_TRANSIENT_ANNOTATION);
		module.enable(Hibernate5Module.Feature.FORCE_LAZY_LOADING);
		return module;
	}
}
