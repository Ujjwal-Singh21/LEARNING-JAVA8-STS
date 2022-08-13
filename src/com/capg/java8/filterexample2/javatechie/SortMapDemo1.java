package com.capg.java8.filterexample2.javatechie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// (step-1) Traditional Approach
//-------------------------------
//public class SortMapDemo1 {
//
//	public static void main(String[] args) {
//
//		Map<String, Integer> hashMap = new HashMap<>();
//		
//		hashMap.put("eight", 8);
//		hashMap.put("four", 4);
//		hashMap.put("ten", 10);
//		hashMap.put("two", 2);
//		
////		System.out.println(hashMap); // -> {four=4, ten=10, two=2, eight=8}
////		Set<Map.Entry<String, Integer>> data1 = hashMap.entrySet(); // -> [four=4, ten=10, two=2, eight=8]
////		System.out.println(data1);
//
//		List<Map.Entry<String, Integer>> entriesList = new ArrayList<>(hashMap.entrySet());
//		
////		System.out.println(entriesList); // -> [four=4, ten=10, two=2, eight=8]
//
//		Collections.sort(entriesList, new Comparator<Map.Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
//
//		for (Map.Entry<String, Integer> entry : entriesList) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//	}
//}

// (step-2) Using LAMBDA
//----------------------
//public class SortMapDemo1 {
//
//	public static void main(String[] args) {
//
//		Map<String, Integer> hashMap = new HashMap<>();
//		hashMap.put("eight", 8);
//		hashMap.put("four", 4);
//		hashMap.put("ten", 10);
//		hashMap.put("two", 2);
//
//		List<Entry<String, Integer>> entriesList = new ArrayList<>(hashMap.entrySet());
//
//		Collections.sort(entriesList, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//
//		// Can also write just Entry here instead of Map.Entry
//		for (Map.Entry<String, Integer> entry : entriesList) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//	}
//}

// (step-3) using STREAM API
//--------------------------
public class SortMapDemo1 {

	public static void main(String[] args) {

		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("zero", 0);
		hashMap.put("two", 2);
		hashMap.put("eight", 8);
		hashMap.put("four", 4);
		hashMap.put("ten", 10);
		

		// SORTING BY KEY USING comparingByKey() method that returns a comparator to compare Map.Entry
		//--------------------------------------------------------------------------------------------
		hashMap.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("***********************************************************");

		// SORTING BY KEY USING comparingByValue() method that returns a comparator to compare Map.Entry
		//----------------------------------------------------------------------------------------------
		hashMap.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
		
		// NOTE -> Entry.comparingByKey() can slso be written as Map.Entry.comparingByKey()
	}
}



