package com.atsistemas.formacion.base.spring.core.examples.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.spring.core.examples.date.DateUtils;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	@Autowired
	@Qualifier("dateUtilsNew")
	private DateUtils dateUtils;

//	public HelloServiceImpl(DateUtils dateUtils) {
//		this.dateUtils = dateUtils;
//	}

	@Override
	public void sayHello() {
		System.out.println("Hello! now: " + dateUtils.now());
	}

}
