package com.capg.java8.lambda.methodReference;

// using parser and logic to convert:
// interface internally calling StringParser class for conversion logic:
//----------------------------------------------------------------------
interface Parser {
	public abstract String parse(String rawString);
}

// class used for conversion logic 
//---------------------------------
class StringParserClass {
	
	// method
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
//------------------------------------------------------------
class MyPrinter {

	// method -> passing an reference of parser here -> saving received convertedString into finalString
	public void print(String rawString, Parser p) { 
		String finalString = p.parse(rawString); 
		System.out.println(finalString);
	}
}

// 1) Without lambda
//-------------------
public class MethodReferenceDemo2 {

	public static void main(String[] args) {

//		String rawString = "Ujjwal Singh";
		String rawString = "Raj";
		
		MyPrinter myPrinter = new MyPrinter();

		// making anonymous class for interface to make its reference for passing above:
		myPrinter.print(rawString, new Parser() {
			
			@Override
			public String parse(String rawString) {
				return StringParserClass.convert(rawString); // takes raw String & returns Converted String
			}
		});
	}
}

// 2) With lambda
//----------------
//public class MethodReferenceDemo2 {
//
//	public static void main(String[] args) {
//
//		String rawString = "Ujjwal Singh";
//		MyPrinter myPrinter = new MyPrinter();
//
//		myPrinter.print(rawString, (s -> StringParser.convert(s)));
//
//	}
//}