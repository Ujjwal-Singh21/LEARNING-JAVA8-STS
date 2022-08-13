package com.capg.java8.filterexample2.javatechie;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

// If map key contains some custom object instead of primitive hence Using Employee Pojo and Sorting using comparator
//-------------------------------------------------------------------------------------------------------------------
//public class SortMapDemo2 {
//
//	public static void main(String[] args) {
//
//		Map<Employee, Integer> employeeTreeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
//
//		employeeTreeMap.put(new Employee(176, "Roshan", "IT", 6000), 60);
//		employeeTreeMap.put(new Employee(388, "Vikash", "CIVIL", 9000), 90);
//		employeeTreeMap.put(new Employee(470, "Bimalesh", "DEFENSE", 5000), 50);
//		employeeTreeMap.put(new Employee(624, "Saurav", "CORE", 4000), 40);
//		employeeTreeMap.put(new Employee(176, "Prakash", "SOCIAL", 12000), 12);
//
//		// If .entrySet() is removed -> error: Can only iterate over an array or an instance of java.lang.Iterable
        //--------------------------------------------------------------------------------------------------------
//		for (Map.Entry<Employee, Integer> entries : employeeTreeMap.entrySet())
//			System.out.println(entries);
//
//	}
//}

// Sorting using Strem Api
//------------------------
public class SortMapDemo2 {

	public static void main(String[] args) {

		Map<Employee, Integer> employeeTreeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));

		employeeTreeMap.put(new Employee(176, "Roshan", "IT", 6000), 60);
		employeeTreeMap.put(new Employee(388, "Vikash", "CIVIL", 9000), 90);
		employeeTreeMap.put(new Employee(470, "Bimalesh", "DEFENSE", 5000), 50);
		employeeTreeMap.put(new Employee(624, "Saurav", "CORE", 4000), 40);
		employeeTreeMap.put(new Employee(176, "Prakash", "SOCIAL", 12000), 12);

		employeeTreeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept)))
				.forEach(System.out::println);
	}
}
