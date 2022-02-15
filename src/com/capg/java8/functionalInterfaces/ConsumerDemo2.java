package com.capg.java8.functionalInterfaces;

import java.util.function.Consumer;

// Consumer :- takes an argument but returns nothing
//WITHOUT LAMBDA USING ANONYMOUS FUNCTION
public class ConsumerDemo2 {

	public static void main(String[] args) {

		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);

			}

		};

		consumer.accept(55);

	}

}
