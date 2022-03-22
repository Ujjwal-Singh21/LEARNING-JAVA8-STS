package com.capg.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// BREAKDOWN OF FOR-EACH LOOP USING CONSUMER INTERFACE
// MAKING SEPERATE IMPLEMENTATION CLASS FOR CONSUMER INTERFACE , has a method accept();
class ConsumerImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer i) {

		System.out.println(i);
	}

}

// step(0.0) USING  ABOVE IMPLEMENTATION CLASS
public class ForEachDemo2 {

	public static void main(String[] args) {

		//We have create an Array as List here for numbers
		List<Integer> list = Arrays.asList(5, 6, 7, 8, 9);

		//creating reference of consumer interface using its implementation class
		Consumer<Integer> consumer = new ConsumerImpl(); 
		
	    // passing that consumer object as parameter to for-each
		list.forEach(consumer);  
	}

}

// step-0 (WITHOUT LAMBDA)
//public class ForEachDemo2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = Arrays.asList(5, 6, 7, 8, 9);
//
//		Consumer<Integer> consumer = new Consumer<Integer>() {
//
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//
//		};

//		list.forEach(consumer); // passing object of consumer to for-each
//	}
//
//}

// removing boiler plate code step by step (every step will run seperately and give same output)

//step-1(removing right side of object creation, method name & return type, parameter return type )
//public class ForEachDemo2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = Arrays.asList(5, 6, 7, 8, 9);
//
//		Consumer<Integer> consumer = (i) -> {
//			System.out.println(i);
//		};
//
//		list.forEach(consumer); // passing object of consumer to for-each
//	}
//
//}

//step-2(removing anonymous curly braces, single parameter braces, semicolon)
//public class ForEachDemo2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = Arrays.asList(5, 6, 7, 8, 9);
//
//		Consumer<Integer> consumer = i -> System.out.println(i);
//
//		list.forEach(consumer); // passing object of consumer to for-each
//	}
//
//}

// step-3(removing consumer object reference and passing directly to for each)
//public class ForEachDemo2 {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = Arrays.asList(5, 6, 7, 8, 9);
//
//		list.forEach(i -> System.out.println(i)); // passing object of consumer to for-each
//	}
//
//}
