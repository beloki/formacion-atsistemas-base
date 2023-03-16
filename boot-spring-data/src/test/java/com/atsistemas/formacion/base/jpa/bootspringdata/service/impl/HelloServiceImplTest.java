package com.atsistemas.formacion.base.jpa.bootspringdata.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloServiceImplTest {

	private HelloServiceImpl helloServiceImpl;

	@BeforeAll
	public static void init() {
//		helloServiceImpl = new HelloServiceImpl();
	}

	@BeforeEach
	public void setup() {
		this.helloServiceImpl = new HelloServiceImpl();
	}

	@Test
	public void testSayHello() {
		String hello = helloServiceImpl.hello("Chico");

		Assertions.assertEquals("Hello Chico", hello);
	}

	@Test
	public void testSayHelloNull() {

		RuntimeException exception = Assertions.assertThrows(RuntimeException.class,
				() -> helloServiceImpl.hello(null));
		Assertions.assertEquals("Error!", exception.getMessage());
	}

}
