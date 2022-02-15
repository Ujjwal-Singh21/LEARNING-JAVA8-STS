package com.capg.java8.lambdawithcomparataor;

import java.util.ArrayList;
import java.util.List;

// keep it as a database
public class BookDAO {
	
	public List<Book> getBooks(){
		List<Book> book = new ArrayList<>();
		book.add(new Book(1,555,"Core Java"));
		book.add(new Book(3,335,"Hibernate"));
		book.add(new Book(2,295,"Jpa"));
		book.add(new Book(4,467,"Angular"));
		return book;
		
	}

}
