package com.capg.java8.lambda.methodReference;

// using parser and logic to convert:

// interface internally calling StringParser class for conversion logic:
interface Parser {
	public String parse(String rawString);
}

// class used for conversion logic 
class StringParser {
	public static String convert(String rawString) {
		String convertedString;
		if (rawString.length() <= 3)
			convertedString = rawString.toUpperCase();
		else
			convertedString = rawString.toLowerCase();
		return convertedString;
	}
}

// class used for getting final converted string and print it:
class MyPrinter {

	public void print(String rawString, Parser p) { // passing an object of parser here
		String finalString = p.parse(rawString); // saving received convertedString into finalString
		System.out.println(finalString);
	}
}

//Without lambda
//public class MethodReferenceDemo2 {
//
//	public static void main(String[] args) {
//
//		String rawString = "Ujjwal Singh";
//		MyPrinter myPrinter = new MyPrinter();
//
//		// making anonymous class for interface to make its object for passing above:
//		myPrinter.print(rawString, new Parser() {
//			public String parse(String rawString) {
//				return StringParser.convert(rawString); // takes raw String & returns Converted String
//			}
//		});
//
//	}
//
//}

//With lambda
public class MethodReferenceDemo2 {

	public static void main(String[] args) {

		String rawString = "Ujjwal Singh";
		MyPrinter myPrinter = new MyPrinter();

		myPrinter.print(rawString, (s -> StringParser.convert(s)));

	}

}