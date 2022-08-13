package com.capg.java8.filterexample2.javatechie;
import java.util.ArrayList;
import java.util.List;

// DAO LAYER 
//----------
public class DataBase {

	public static List<Employee> getAllEmployees() {

		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(176, "Roshan", "IT", 6000));
		list.add(new Employee(388, "Vikash", "CIVIL", 9000));
		list.add(new Employee(470, "Bimalesh", "DEFENSE", 5000));
		list.add(new Employee(624, "Saurav", "CORE", 4000));
		list.add(new Employee(176, "Prakash", "SOCIAL", 12000));

		return list;
	}
}
