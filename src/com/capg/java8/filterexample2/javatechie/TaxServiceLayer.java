package com.capg.java8.filterexample2.javatechie;

import java.util.List;
import java.util.stream.Collectors;

// (step-1) filtering employess having salary > 5 lakhs INR
//--------------------------------------------------------------
//public class TaxServiceLayer {
//
//	public static List<Employee> evaluateTaxUsers() {
//
//		return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList());
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println(TaxServiceLayer.evaluateTaxUsers());
//	}
//
//}

// (step-2) making it dynamic using equalsIgnoreCase() method
//--------------------------------------------------------------
//public class TaxServiceLayer {
//
//	public static List<Employee> evaluateTaxUsers(String input) {
//		
//		if (input.equalsIgnoreCase("tax")) {
//			return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000)
//					.collect(Collectors.toList());
//		} else {
//			return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
//					.collect(Collectors.toList());
//		}
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println(TaxServiceLayer.evaluateTaxUsers("tax")); // for above 5 lakhs salary
//		System.out.println(TaxServiceLayer.evaluateTaxUsers("non tax"));  // for below 5 lakhs salary
//	}
//
//}

// (step-3) using ternary operator instead of if-else condition
//-----------------------------------------------------------------
public class TaxServiceLayer {

	public static List<Employee> evaluateTaxUsers(String input) {

		return (input.equalsIgnoreCase("tax"))
				? DataBase.getAllEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				:

				DataBase.getAllEmployees().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());

	}

	public static void main(String[] args) {

		System.out.println(TaxServiceLayer.evaluateTaxUsers("tax")); // for above 5 lakhs salary
		System.out.println(TaxServiceLayer.evaluateTaxUsers("non tax")); // for below 5 lakhs salary
	}

}