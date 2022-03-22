package com.capg.java8.filterexample2.javatechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//for Custom objects
//sorting using Comparator separate class.
//------------------------------------------
public class SortListDemo2 {

	public static void main(String[] args) {

		//getting List of Employees from DataBase Class
		List<Employee> employees = DataBase.getEmployees();

		//sorting using 2nd sort method that needs Comparator as 2nd arg
		Collections.sort(employees, new MyComparator());
		System.out.println(employees);

	}

}

//Separate implementation class for Comparator
class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employeeObj1, Employee employeeObj2) {

		// typecasting -> double to int -> because Comparator should return primitive int type number(eg:- 1 or -1 ).
		// and then sorting as descending order
		return (int) (employeeObj2.getSalary() - employeeObj1.getSalary()); 
	}
}