package com.capg.java8.lambda.methodReference;

// simple basic example
class MyPrinter1 {

	public void print(String str) {

		System.out.println(str);
	}
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {

		String str = "Ujjwal Singh";
		MyPrinter1 myPrinter1 = new MyPrinter1();
		myPrinter1.print(str);

	}

}
