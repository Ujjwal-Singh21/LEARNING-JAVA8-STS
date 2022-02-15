package com.capg.java8.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// map() method takes Function object as input argument
//public class MapDemo {
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

// more simplified
public class MapDemo {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Hello", "Stream", "Learning");

		// here map method takes Function as input argument
		words.stream().map(t -> t.length()).forEach(System.out::println);
	}

}
