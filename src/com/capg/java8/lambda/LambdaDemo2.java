package com.capg.java8.lambda;

interface AddInterface {
	public abstract int add(int a, int b);
}

// IMPLEMENTATION OF AddInterface WITH LAMBDA EXPRESSION
//------------------------------------------------------
//public class LambdaDemo2 {
//
//	public static void main(String[] args) {
//
//		AddInterface addInterface = (a, b) -> a + b;
//
//		System.out.println(addInterface.add(22, 22));
//	}
//}

// BOILER PLATE SAME CODE WITHOUT LAMBDA
//--------------------------------------
//public class LambdaDemo2 {  // outer main class
//
//	public static void main(String[] args) {
//
//		// making an inner anonymous class
//		AddInterface addInterface = new AddInterface() { 
//			@Override
//			public int add(int a, int b) {
//				return a + b;
//			}
//		};
//		
//		System.out.println(addInterface.add(22, 22));
//	}
//}