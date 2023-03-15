package com.atsistemas.formacion.base.java.functionalprogramming.clasesanonimas;

public class ClasesAnonimasMain {

	public static void main(String[] args) {
		BusinessService serviceNamedClass = new BusinessServiceImpl();
		boolean check = serviceNamedClass.check();
		Integer result = serviceNamedClass.doSomething();
		System.out.println("Check: " + check + "; Result: " + result);

		BusinessService businessService2 = new BusinessService() {

			private String miatributonuevo;

			@Override
			public Integer doSomething() {
				hello();
				return 34;
			}

			@Override
			public boolean check() {
				return false;
			}

			private void hello() {

			}

		};

		System.out.println("Check2: " + businessService2.check() + "; Result2: " + businessService2.doSomething());
	}

}
