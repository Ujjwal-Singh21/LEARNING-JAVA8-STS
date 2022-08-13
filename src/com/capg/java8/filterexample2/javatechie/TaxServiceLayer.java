package com.capg.java8.filterexample2.javatechie;
import java.util.List;
import java.util.stream.Collectors;

// (step-1) filtering employess having salary > 5 thousands INR
//--------------------------------------------------------------
//public class TaxServiceLayer {
//
//	public static List<Employee> evaluateTaxUsers() {
//		
//		return DataBase.getAllEmployees().stream()
//				.filter(emp -> emp.getSalary() > 5000)
//				.collect(Collectors.toList());
//	}
//
//	public static void main(String[] args) {
//		System.out.println(evaluateTaxUsers());
//	}
//}

// (step-2) Making it dynamic using equalsIgnoreCase() method
//--------------------------------------------------------------
//public class TaxServiceLayer {
//
//	public static List<Employee> evaluateTaxUsers(String input) {
//		
//		if (input.equalsIgnoreCase("tax")) {
//			return DataBase.getAllEmployees()
//					.stream()
//					.filter(emp -> emp.getSalary() > 5000)
//					.collect(Collectors.toList());
//		} else {
//			return DataBase.getAllEmployees()
//					.stream()
//					.filter(emp -> emp.getSalary() <= 5000)
//					.collect(Collectors.toList());
//		}
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println(evaluateTaxUsers("tax")); // for above 5 Thousand salary
//		System.out.println(evaluateTaxUsers("non tax"));  // for below 5 Thousand salary
//	}
//}

// (step-3) Using ternary operator instead of if-else condition
//-------------------------------------------------------------
public class TaxServiceLayer {

	public static List<Employee> evaluateTaxUsers(String input) {

		return (input.equalsIgnoreCase("tax"))
				
				? DataBase.getAllEmployees()
						.stream()
						.filter(emp -> emp.getSalary() > 5000)
						.collect(Collectors.toList())
						
				: DataBase.getAllEmployees()
				        .stream()
				        .filter(emp -> emp.getSalary() <= 5000)
				        .collect(Collectors.toList());
	}

	public static void main(String[] args) {

		System.out.println(evaluateTaxUsers("tax")); // for above 5 Thousand salary
		System.out.println(evaluateTaxUsers("non tax")); // for below 5 Thousand salary
	}
}