package com.atsistemas.formacion.base.spring.core.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.atsistemas.formacion.base.spring.core.examples.date.DateUtils;
import com.atsistemas.formacion.base.spring.core.examples.date.DateUtilsJava8;
import com.atsistemas.formacion.base.spring.core.examples.date.DateUtilsLegacy;
import com.atsistemas.formacion.base.spring.core.examples.hello.HelloService;
import com.atsistemas.formacion.base.spring.core.examples.hello.HelloServiceImpl;

@Configuration
@ComponentScan(basePackages = { "com.atsistemas.formacion.base.spring.core.examples" })
public class AppConfig {

//	@Bean
//	public HelloService helloService() {
//		HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
//		helloServiceImpl.setDateUtils(dateUtils());
//		return helloServiceImpl;
//	}

//	@Bean
//	public HelloService helloService(DateUtils dateUtils) {
//		return new HelloServiceImpl(dateUtils);
//	}

	@Bean(name = "dateUtilsOld")
	public DateUtils dateUtilsLegacy() {
		return new DateUtilsLegacy();
	}

	@Bean(name = "dateUtilsNew")
	public DateUtils dateUtilsJava8() {
		return new DateUtilsJava8();
	}

}
