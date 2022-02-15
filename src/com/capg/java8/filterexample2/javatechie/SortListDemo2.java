package com.capg.java8.filterexample2.javatechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//for Custom objects
// sorting using comparator separate class.
public class SortListDemo2 {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmployees();

		// Collections.sort(employees, new MyComparator());
		Collections.sort(employees, new MyComparator());
		System.out.println(employees);

	}

}

//Separate implementation class for comparator
class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return (int) (o2.getSalary() - o1.getSalary()); // typecasting long to int and ascending order
	}
}