package com.capg.java8.mapVsflatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

	public static List<Customer> getAllCustomers() {

		return Stream.of(

				new Customer(101, "Smith", "Smith@gmail.com", Arrays.asList("397937955", "21654725")),
				new Customer(101, "john", "john@gmail.com", Arrays.asList("397937453", "21654736")),
				new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
				new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467")))
				.collect(Collectors.toList());

	}
}
