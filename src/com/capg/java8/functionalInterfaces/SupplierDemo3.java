package com.capg.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Supplier :- takes no argument but something.
//(STEP-0)WITH LAMBDA
//public class SupplierDemo3 {
//
//	public static void main(String[] args) {
//
//		Supplier<String> supplier = () -> "Hello Ujjwal Again";
//
//		System.out.println(supplier.get());
//
//	}
//
//}

// (STEP-1) WITH LAMBDA USING "findAny()" & "orElseGet()" -> METHOD THAT TAKES SUPPLIER OBJECT AS INPUT
//public class SupplierDemo3 {
//
//	public static void main(String[] args) {
//
//      //Creating a Names Array as List
//		List<String> nameList = Arrays.asList("Michael", "James", "Tony");
//		Supplier<String> supplier = () -> "Hello Ujjwal Again";
//
//		// passing supplier object reference directly to orElseGet() method
//		System.out.println(nameList.stream().findAny().orElseGet(supplier));
//
//	}
//
//}

// (STEP-3) WITHOUT PASSING SUPPLIER OBJECT REFERENCE DIRECTLY TO "orElseGet()" METHOD.
// DIRECTLY PASSING RIGHT SIDE INSTEAD OF OBJECT (REMOVE LHS OF LINE 45)
//public class SupplierDemo3 {
//
//	public static void main(String[] args) {
//
//		// Keeping list empty so that "orElseGet()" can execute.
//		List<String> nameList = Arrays.asList();
//
//		// Supplier<String> supplier = () -> "Hello Ujjwal Again";
//
//		System.out.println(nameList.stream().findAny().orElseGet(() -> "Hello Ujjwal Again"));
//
//	}
//
//}
