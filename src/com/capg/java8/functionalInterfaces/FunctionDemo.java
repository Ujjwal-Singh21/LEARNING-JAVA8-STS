package com.capg.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Function: it takes an argument and returns another object
// It has two type generics T,R where T is input type and R is ouput or result type
// (step-0) without lambda using anonymous class
//public class FunctionDemo {
//
//	public static void main(String[] args) {
//
//     //creating a String Array as List
//		List<String> words = Arrays.asList("Hello", "Stream", "Learning");
//
//		Function<String, Integer> function = new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String t) {
//
//				return t.length();
//			}
//
//		};
//		
//		// here map method takes Function object as input argument
//		words.stream().map(function).forEach(System.out::println);
//	}
//
//}

// (step-1) using lambda
//public class FunctionDemo {
//
//	public static void main(String[] args) {
//
//      //creating a String Array as List
//		List<String> words = Arrays.asList("Hello", "Stream", "Learning");
//
//		Function<String, Integer> function = (String t)-> {
//
//				return t.length();
//			
//		};
//		
//		// here map method takes Function as input argument
//		words.stream().map(function).forEach(System.out::println);
//	}
//
//}

// (step-2) (simplifying more using lambda
// removing argument return type, return keyword , braces)
//public class FunctionDemo {
//
//	public static void main(String[] args) {
//
//		List<String> words = Arrays.asList("Hello", "Stream", "Learning");
//
//		Function<String, Integer> function = t -> t.length();
//
//		// here map method takes Function as input argument
//		words.stream().map(function).forEach(System.out::println);
//	}
//
//}

// (step-3) passing RHS of function object instead of passing function as reference
public class FunctionDemo {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Hello", "Stream", "Learning");

		// here map method takes Function as input argument
		words.stream().map(t -> t.length()).forEach(System.out::println);

	}

}
