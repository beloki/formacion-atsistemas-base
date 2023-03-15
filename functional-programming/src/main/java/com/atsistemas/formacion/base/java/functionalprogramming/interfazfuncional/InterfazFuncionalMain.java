package com.atsistemas.formacion.base.java.functionalprogramming.interfazfuncional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class InterfazFuncionalMain {
	public static void main(String[] args) {
//		BusinessService businessService = () -> {
//			return 1;
//		};

//		System.out.println("Result: " + businessService.doSomething());

//		Function<String, Integer> length = s -> s.length();

		Function<String, Integer> valueof = InterfazFuncionalMain::execute;

//		Function<String, Integer> valueof = Integer::valueOf;

		System.out.println("Valor entero: " + valueof.apply("1"));

//		BiFunction<String, Integer, String> substring = (s, i) -> s.substring(i);
//		
		BiFunction<String, Integer, String> length1 = String::substring;
//
//		System.out.println("Result: " + length.apply("hola"));

	}

	private static Integer execute(String param) {
		return 1;
	}
}
