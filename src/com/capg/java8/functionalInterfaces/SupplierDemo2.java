package com.capg.java8.functionalInterfaces;
import java.util.function.Supplier;

// Supplier -> takes no argument but returns something.
// WITH LAMBDA USING ANONYMOUS FUNCTION
//-----------------------------------------------------
public class SupplierDemo2 {

	public static void main(String[] args) {

		Supplier<String> supplier = new Supplier<String>() {
			@Override
			public String get() {
				return "Hello Ujjwal Again";
			}
		};

		System.out.println(supplier.get());
	}
}
