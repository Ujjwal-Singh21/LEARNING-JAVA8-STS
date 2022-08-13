package com.capg.java8.lambda;
import java.util.Arrays;
import java.util.List;

// BREAKDOWN OF FOR-EACH LOOP USING CONSUMER INTERFACE
// SIMPLE WITH LAMBDA
//-----------------------------------------------------
public class ForEachDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 6, 7, 8, 9);

		list.forEach(i -> System.out.println(i)); // FOR-EACH TAKES CONSUMER OBJECT AS INPUT
	}
}
