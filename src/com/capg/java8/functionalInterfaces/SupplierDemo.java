package com.capg.java8.functionalInterfaces;

import java.util.function.Supplier;

//Supplier :- takes no argument but something.
//WITHOUT LAMBDA USING TRADITIONAL METHOD
public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {

		return "Hello Ujjwal";
	}

	public static void main(String[] args) {

		Supplier<String> supplier = new SupplierDemo();
		System.out.println(supplier.get());

	}

}
