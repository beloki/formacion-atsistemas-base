package com.atsistemas.formacion.base.spring.core.examples;

import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.formacion.base.spring.core.examples.hello.ClaseEjemplo;
import com.atsistemas.formacion.base.spring.core.examples.hello.HelloService;

public class CoreMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = ctx.getBean(HelloService.class);

		ClaseEjemplo bean = ctx.getBean(ClaseEjemplo.class);
		bean.setId("1");
		System.out.println("Clase Ejemplo: " + bean.getId());

		helloService.sayHello();

		bean.setId("2");
		System.out.println("Clase Ejemplo: " + bean.getId());

		ClaseEjemplo bean2 = ctx.getBean(ClaseEjemplo.class);
		bean2.setId("3");
		System.out.println("Clase Ejemplo2 : " + bean2.getId());

		System.out.println("Clase Ejemplo1 : " + bean.getId());

		helloService.sayHello();
//		DateUtils bean = (DateUtils) ctx.getBean("dateUtilsOld");
//		System.out.println(bean.now());

		helloService.sayHello();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
