package com.capg.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Consumer :- takes an argument but returns nothing
//WITH LAMBDA 
public class ConsumerDemo3 {

	public static void main(String[] args) {

		Consumer<Integer> consumer = t -> System.out.println(t);
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.forEach(consumer); // FOR-EACH TAKES CONSUMER OBJECT AS INPUT
	}

}

// LITTLE MORE SIMPLIFIED WITH LAMBDA 
//public class ConsumerDemo3 {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//
//		list.forEach(t -> System.out.println(t)); 
//	}
//
//}
