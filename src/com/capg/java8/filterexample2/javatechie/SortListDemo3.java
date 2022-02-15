package com.capg.java8.filterexample2.javatechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// for Custom objects
// sorting using comparator using anonymous class.
//public class SortListDemo3 {
//
//	public static void main(String[] args) {
//
//		List<Employee> employees = DataBase.getEmployees();
//
//		Collections.sort(employees, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee e1, Employee e2) {
//
////				return (int) (e1.getSalary() - e2.getSalary());
//				return e1.getDept().compareTo(e2.getDept());
//			}
//		});
//		
//		System.out.println(employees);
//
//	}
//}

// simplified using lambda expression
public class SortListDemo3 {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmployees();

		Collections.sort(employees, ( e1,  e2) ->  (int) (e1.getSalary() - e2.getSalary()));

		System.out.println(employees);

		// same thing using streamAPI (sorted takes comparator as input so passing above lambda comparator
		employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);
		
		//using comparing method of comparator interface instead of passing lambda of comparator
		//comparing method takes Function object as Input
		employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
		
		//using method reference inside comparing method instead of lambda for function(classNAme::sorting method)
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
	
	}

}



