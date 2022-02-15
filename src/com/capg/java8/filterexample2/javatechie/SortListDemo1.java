package com.capg.java8.filterexample2.javatechie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// How to Sort a List using lambda | Example | Java Techie
// for primitives
public class SortListDemo1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(88);
		list.add(9);
		list.add(10);
		list.add(4);
		list.add(3);

		// SORTING USING COLLECTIONS CLASS METHODS
		Collections.sort(list); // normal ascending order
		System.out.println("Using Collections class sort :" + list);
		Collections.reverse(list); // normal descending order
		System.out.println("Using Collections class reverse sort :" + list);

		// SORTING USING STREAM
		list.stream().sorted().forEach(s -> System.out.println("Using stream api normal sorted method :" + s));
		// ANOTHER SORTED METHOD WHICH TAKES COMPARATOR AS INPUT
		list.stream().sorted(Comparator.reverseOrder())
				.forEach(s -> System.out.println("Using stream api second  sorted method :" + s));
	}

}
