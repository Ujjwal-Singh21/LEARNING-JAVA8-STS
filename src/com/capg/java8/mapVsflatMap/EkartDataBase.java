package com.capg.java8.mapVsflatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1) using stream.of() method inside which we will create multiple objects for Customer.
// 2) Reason to use -> as soon as an object gets created it becomes a Stream.
// 3) So at the end we can easily collect them all as List and return it.

public class EkartDataBase {

	public static List<Customer> getAllCustomers() {

		return Stream.of(
				new Customer(101, "Smith", "Smith@gmail.com", Arrays.asList("397937955", "21654725")),
				new Customer(101, "john", "john@gmail.com", Arrays.asList("397937453", "21654736")),
				new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
				new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
				).collect(Collectors.toList());

	}
}
