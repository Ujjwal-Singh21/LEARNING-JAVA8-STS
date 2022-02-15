package com.capg.java8.filterexample2.javatechie;

import java.util.ArrayList;
import java.util.List;

// DAO LAYER
public class DataBase {

	public static List<Employee> getEmployees() {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(176, "Roshan", "IT", 600000));
		list.add(new Employee(388, "Vikash", "CIVIL", 900000));
		list.add(new Employee(470, "Bimalesh", "DEFENSE", 500000));
		list.add(new Employee(624, "Saurav", "CORE", 400000));
		list.add(new Employee(176, "Prakash", "SOCIAL", 1200000));
		return list;
	}

}
