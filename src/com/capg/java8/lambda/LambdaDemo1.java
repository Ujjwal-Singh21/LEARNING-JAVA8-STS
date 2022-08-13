package com.capg.java8.lambda;

interface A {
	public abstract void show();
}

// IMPLEMENTATION CLASS OF INTERFACE A WITHOUT LAMBDA EXPRESSION
class Implementation implements A {

	@Override
	public void show() {
		System.out.println("Lambda Expression");
	}
}

public class LambdaDemo1 {

	public static void main(String[] args) {

		A a = new Implementation();
		a.show();
	}
}
