package com.capg.java8.filterexample2.javatechie;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

// If map key contains some custom object instead of primitive hence Using Employee Pojo
//Sorting using comparator
//public class SortMapDemo2 {
//
//	public static void main(String[] args) {
//
//		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
//
//		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
//		employeeMap.put(new Employee(388, "Vikash", "CIVIL", 900000), 90);
//		employeeMap.put(new Employee(470, "Bimalesh", "DEFENSE", 500000), 50);
//		employeeMap.put(new Employee(624, "Saurav", "CORE", 400000), 40);
//		employeeMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 12);
//
//		for (Map.Entry<Employee, Integer> entries : employeeMap.entrySet())
//			System.out.println(entries);
//
//	}
//
//}

//Sorting using Strem Api
public class SortMapDemo2 {

	public static void main(String[] args) {

		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));

		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Vikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimalesh", "DEFENSE", 500000), 50);
		employeeMap.put(new Employee(624, "Saurav", "CORE", 400000), 40);
		employeeMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000), 12);

		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept)))
				.forEach(System.out::println);
	}

}
