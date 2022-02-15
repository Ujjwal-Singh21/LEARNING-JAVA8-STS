package com.capg.java8.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// The reduce () method takes a BinaryOperator as argument and returns an Optional instance
public class ReduceDemo {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(5, 7, 3, 9);

		// Reduction of elements by adding them
		Optional<Integer> result = intList.stream().reduce((a, b) -> a + b);
		if (result.isPresent()) {
			System.out.println("Result:" + result.get());
		}

	}

}
