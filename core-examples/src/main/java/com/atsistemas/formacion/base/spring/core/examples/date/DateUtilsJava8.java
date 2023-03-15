package com.atsistemas.formacion.base.spring.core.examples.date;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
public class DateUtilsJava8 implements DateUtils {

	@Override
	public String now() {
		return LocalDateTime.now().toString();
	}

}
