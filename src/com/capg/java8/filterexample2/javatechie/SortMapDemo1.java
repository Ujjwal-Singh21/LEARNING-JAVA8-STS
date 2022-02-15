package com.capg.java8.filterexample2.javatechie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// (step-1) Traditional approach
public class SortMapDemo1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getKey().compareTo(o2.getKey());
			}
		});

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}

// (step-2) using LAMBDA
//public class SortMapDemo1 {
//
//	public static void main(String[] args) {
//
//		Map<String, Integer> map = new HashMap<>();
//		map.put("eight", 8);
//		map.put("four", 4);
//		map.put("ten", 10);
//		map.put("two", 2);
//
//		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//
//		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//
//		for (Entry<String, Integer> entry : entries) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//	}
//
//}

// (step-3) using STREAM API
//public class SortMapDemo1 {
//
//	public static void main(String[] args) {
//
//		Map<String, Integer> map = new HashMap<>();
//		map.put("eight", 8);
//		map.put("four", 4);
//		map.put("ten", 10);
//		map.put("two", 2);
//
//		// SORTING BY KEY USING comparingByKey() method that returns a comparator to
//		// compare Map.Entry
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//
//		System.out.println("*********************");
//
//		// SORTING BY KEY USING comparingByKey() method that returns a comparator to
//		// compare Map.Entry
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//
//	}
//
//}



