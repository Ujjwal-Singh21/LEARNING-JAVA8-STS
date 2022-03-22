package com.capg.java8.lambdawithcomparataor;

import java.util.ArrayList;
import java.util.List;

// keep it as a database
public class BookDAO {
	
	public List<Book> getBooks(){
		
		//creating an ArrayList of Books
		List<Book> bookArrayList = new ArrayList<>();
		
		bookArrayList.add(new Book(1,555,"Core Java"));
		bookArrayList.add(new Book(3,335,"Hibernate"));
		bookArrayList.add(new Book(2,295,"Jpa"));
		bookArrayList.add(new Book(4,467,"Angular"));
		
		return bookArrayList;
		
	}

}
