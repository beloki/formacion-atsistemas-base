package com.atsistemas.formacion.base.java.functionalprogramming.clasesanonimas;

public class ClasesAnonimasMain {

	public static void main(String[] args) {
		BusinessService serviceNamedClass = new BusinessServiceImpl();
		boolean check = serviceNamedClass.check();
		Integer result = serviceNamedClass.doSomething();

		System.out.println("Check: " + check + "; Result: " + result);
	}

}
