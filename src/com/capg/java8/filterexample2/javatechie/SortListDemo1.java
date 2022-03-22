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

		// 1) SORTING USING COLLECTIONS CLASS sort() method :-
		//-----------------------------------------------------
		// normal ascending order
		Collections.sort(list); 
		System.out.println("Using Collections class sort :" + list);
		
		//since now the list is sorted in ascending order, simply reversing this updated list will give
		//descending order
		Collections.reverse(list);
		System.out.println("Using Collections class reverse sort :" + list);

		// 2) SORTING USING STREAM :-
		//----------------------------
		list.stream().sorted().forEach(s -> System.out.println("Using stream api 1st sorted method :" + s));
		
		//ANOTHER SORTED METHOD WHICH TAKES COMPARATOR AS INPUT
		//Here we have used Comparator Interface's static method reverseOrder() for sorting
		//reverseOrder() -> Returns a comparator, that imposes the reverse of the natural ordering.
		list.stream().sorted(Comparator.reverseOrder())
				.forEach(s -> System.out.println("Using stream api 2nd sorted method :" + s));
	}

}
