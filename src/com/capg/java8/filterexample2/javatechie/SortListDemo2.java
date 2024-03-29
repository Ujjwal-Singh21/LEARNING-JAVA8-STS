package com.capg.java8.filterexample2.javatechie;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// for Custom objects
// sorting using Comparator separate class.
//------------------------------------------
public class SortListDemo2 {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getAllEmployees();

		// Sorting using 2nd sort(Comparator c) method, that needs Comparator as 2nd arg
		//------------------------------------------------------------------------------
		Collections.sort(employees, new MyComparator());
		System.out.println(employees);
	}
}

// Separate implementation class for Comparator(I)
//------------------------------------------------
class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employeeObj1, Employee employeeObj2) {

		// typecasting -> double to int -> because Comparator should return primitive int type number(eg:- 1 or -1 ).
		// And then sorting as descending order
		//-----------------------------------------------------------------------------------------------------------
		return (int) (employeeObj2.getSalary() - employeeObj1.getSalary()); 
	}
}