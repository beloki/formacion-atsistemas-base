package com.atsistemas.formacion.base.spring.core.examples.hello;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.spring.core.examples.date.DateUtils;

//@Service("helloService")
public class HelloServiceImpl implements HelloService, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
		InitializingBean, DisposableBean {

//	@Autowired
//	@Qualifier("dateUtilsNew")
	private DateUtils dateUtils;

//	@Autowired
	private ClaseEjemplo claseEjemplo;

	public HelloServiceImpl(DateUtils dateUtils, ClaseEjemplo claseEjemplo) {
		this.dateUtils = dateUtils;
		this.claseEjemplo = claseEjemplo;
		this.claseEjemplo.setId("22");
	}

	@Override
	public void sayHello() {
		System.out.println("Hello! now: " + dateUtils.now() + ". ClaseEjemplo: " + claseEjemplo.getId());
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("EL bean se va a llamar " + name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory");
	}

	@PostConstruct
	public void setup() {
		System.out.println("setup");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	public void init() {
		System.out.println("init");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	public void close() {
		System.out.println("close");
	}

}
