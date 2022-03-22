package com.capg.java8.filterexample2.javatechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// for Custom objects
//---------------------
// 1) sorting using Comparator using anonymous class.
//---------------------------------------------------
//public class SortListDemo3 {
//
//	public static void main(String[] args) {
//
//		List<Employee> employees = DataBase.getEmployees();
//
//		Collections.sort(employees, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee employeeObj1, Employee employeeObj2) {
//
////				return (int) (employeeObj1.getSalary() - employeeObj2.getSalary());
//				return employeeObj1.getDept().compareTo(employeeObj2.getDept());
//			}
//		});
//
//		System.out.println(employees);
//
//	}
//}

// 2) simplified using lambda expression :-
//-----------------------------------------
public class SortListDemo3 {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmployees();

//		Collections.sort(employees,
//				(employeeObj1, employeeObj2) -> (int) (employeeObj1.getSalary() - employeeObj2.getSalary()));
//
//		System.out.println(employees);

		// 3) same thing using streamAPI (2nd sorted() takes comparator as input so passing above lambda comparator
		employees.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).forEach(System.out::println);

		// using comparing() method -> of comparator interface -> instead of passing lambda of comparator.
		// comparing method takes -> Function object as Input
		employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
//
//		// using method reference inside comparing method instead of lambda for
//		// function(className::sorting method)
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

	}

}
