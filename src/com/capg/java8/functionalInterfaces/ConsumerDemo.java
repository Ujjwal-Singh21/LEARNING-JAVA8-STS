package com.capg.java8.functionalInterfaces;

import java.util.function.Consumer;

// Consumer :- takes an argument but returns nothing
//WITHOUT LAMBDA USING TRADITIONAL METHOD
public class ConsumerDemo implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

	public static void main(String[] args) {

		Consumer<Integer> consumer = new ConsumerDemo();
		consumer.accept(33);

	}

}
