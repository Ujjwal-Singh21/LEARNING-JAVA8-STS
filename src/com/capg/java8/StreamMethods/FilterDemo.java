package com.capg.java8.StreamMethods;

import java.util.Arrays;
import java.util.List;

// filter(predicate):-Takes a predicate as an argument and returns a stream including all elements that 
// match the given predicate.
// distinct :- Returns a stream with unique elements (according to the implementation of equals for a stream element).
// limit(n):- Returns a stream that is no longer than the given size n
// skip(n) :- Returns a stream with the first n number of elements discarded

public class FilterDemo {

	public static void main(String[] args) {

		// filter() method takes predicate object as input argument
		List<Integer> listInt = Arrays.asList(11, 3, 44, 5, 66, 33, 44);
		System.out.println("Filtered elements greater than 10: ");
		listInt.stream().filter(num -> num > 10).forEach(num -> System.out.println(num));

		System.out.println("dintinct unique elements: ");
		listInt.stream().distinct().forEach(System.out::println);

		System.out.println("only first four limited elements: ");
		listInt.stream().limit(4).forEach(System.out::println);

		System.out.println("Skipping first four elements: ");
		listInt.stream().skip(4).forEach(System.out::println);

	}

}
