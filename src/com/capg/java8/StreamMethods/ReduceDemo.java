package com.capg.java8.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// The reduce () method takes a BinaryOperator as argument and returns an Optional instance
public class ReduceDemo {

	public static void main(String[] args) {

		// Creating an Array of numbers as List
		List<Integer> intList = Arrays.asList(5, 7, 3, 9);

		// Reduction of elements by adding them...

		// 1st reduce method without initial Value. Hence it returns Optional
		Optional<Integer> result1 = intList.stream().reduce((a, b) -> a + b);
		if (result1.isPresent()) {
			System.out.println("Result1:" + result1.get());
		}

		// 2nd reduce method with initial Value. Hence it returns int, because surely
		// there will be a result
		int result2 = intList.stream().reduce(10, (a, b) -> a + b);
		System.out.println("Result2: " + result2);

	}

}
