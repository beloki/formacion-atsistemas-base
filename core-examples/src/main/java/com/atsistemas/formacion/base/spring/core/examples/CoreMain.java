package com.atsistemas.formacion.base.spring.core.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.formacion.base.spring.core.examples.date.DateUtils;
import com.atsistemas.formacion.base.spring.core.examples.hello.HelloService;

public class CoreMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = ctx.getBean(HelloService.class);

//		DateUtils bean = (DateUtils) ctx.getBean("dateUtilsOld");
//		System.out.println(bean.now());

		helloService.sayHello();
	}

}
