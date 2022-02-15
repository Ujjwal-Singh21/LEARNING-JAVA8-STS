package com.capg.java8.functionalInterfaces;

import java.util.function.Predicate;

// Consumer :- takes an argument and returns BOOLEAN either true or false.
// WITHOUT LAMBDA USING TRADITIONAL METHOD
public class PredicateDemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Predicate<Integer> predicate = new PredicateDemo();
		System.out.println(predicate.test(4));
	}

}
