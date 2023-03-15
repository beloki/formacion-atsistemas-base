package com.atsistemas.formacion.base.spring.core.examples.date;

import java.time.Instant;
import java.util.Date;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class DateUtilsLegacy implements DateUtils {

	@Override
	public String now() {
		return Date.from(Instant.now()).toString();
	}

}
