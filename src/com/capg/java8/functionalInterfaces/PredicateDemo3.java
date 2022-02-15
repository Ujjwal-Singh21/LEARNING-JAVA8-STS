package com.capg.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Consumer :- takes an argument and returns BOOLEAN either true or false.
// (STEP-0) WITH LAMBDA 
//public class PredicateDemo3 {
//
//	public static void main(String[] args) {
//
//		Predicate<Integer> predicate = t -> {
//
//			if (t % 2 == 0)
//				return true;
//			else
//				return false;
//
//		};
//
//		System.out.println(predicate.test(3));
//	}
//
//}

// SINCE PREDICATE NORMALLY RETURNS BOOLEAN TYPE , NO NEED TO WRITE IF ELSE , JUST WRITE LOGIC(t % 2 == 0)
//(STEP-1) MORE SPECIFIED WITH LAMBDA 
//public class PredicateDemo3 {
//
//	public static void main(String[] args) {
//
//		Predicate<Integer> predicate = t -> t % 2 == 0;
//
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//
//		list.forEach(t -> System.out.println(t)); // FOR-EACH TAKES CONSUMER OBJECT AS INPUT
//	}
//
//}

//(STEP-2) USING FILTER METHOD(takes predicate object as input argument) TO PRINT ONLY EVEN NUMBERS
//public class PredicateDemo3 {
//
//	public static void main(String[] args) {
//
//		Predicate<Integer> predicate = t -> t % 2 == 0;
//
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//		// DIRECTLY PASSING PREDICATE OBJECT REFERENCE TO FILTER METHOD
//		list.stream().filter(predicate).forEach(t -> System.out.println(t)); // FOR-EACH TAKES CONSUMER OBJECT AS INPUT
//	}
//
//}

//(STEP-3) WITHOUT PASSING PREDICATE OBJECT REFERENCE TO FILTER METHOD(REMOVE LINE 62).
//  DIRECTLY PASSING RIGHT SIDE INSTEAD OF OBJECT
public class PredicateDemo3 {

	public static void main(String[] args) {

		// Predicate<Integer> predicate = t -> t % 2 == 0;

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// FILTER TAKES PREDICATE OBJECT AS INPUT
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println(t));
	}

}