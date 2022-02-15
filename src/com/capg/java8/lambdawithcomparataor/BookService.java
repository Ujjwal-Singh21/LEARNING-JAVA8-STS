package com.capg.java8.lambdawithcomparataor;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// SORTING BASED ON NAME 
//(STEP-0) 
//WITHOUT LAMBDA USING ANONYMOUS CLASS FOR PASSING COMPARATAOR OBJECT TO SORT METHOD ARGUEMENT
//public class BookService {
//
//	public List<Book> getBooksInSorted() {
//		List<Book> books = new BookDAO().getBooks();
//		Collections.sort(books, new Comparator<Book>() {
//
//			@Override
//			public int compare(Book o1, Book o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//
//		});
//		return books;
//	}
//
//	public static void main(String[] args) {
//
//		BookService bookService = new BookService();
//		List<Book> bookList = bookService.getBooksInSorted();
//		for (Book b : bookList) {
//			System.out.println(b);
//		}
//	}
//
//}

// (step-1) USING LAMBDA 
//(take above override code separately remove and make lambda and copy paste near passing comparator object)
//public class BookService {
//
//	public List<Book> getBooksInSorted() {
//		List<Book> books = new BookDAO().getBooks();
//		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//		return books;
//	}
//
//	public static void main(String[] args) {
//
//		BookService bookService = new BookService();
//		List<Book> bookList = bookService.getBooksInSorted();
//		for (Book b : bookList) {
//			System.out.println(b);
//		}
//	}
//
//}

//SORTING BASED ON ID USING LAMBDA
//public class BookService {
//
//	public List<Book> getBooksInSorted() {
//		List<Book> books = new BookDAO().getBooks();
//		Collections.sort(books, (o1, o2) -> {
//			if (o1.getBookId() > o2.getBookId())
//				return 1;
//			else
//				return -1;
//		});
//		return books;
//	}
//
//	public static void main(String[] args) {
//
//		BookService bookService = new BookService();
//		List<Book> bookList = bookService.getBooksInSorted();
//		for (Book b : bookList) {
//			System.out.println(b);
//		}
//	}
//
//}

// more simplified
public class BookService {

	public List<Book> getBooksInSorted() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (o1, o2) -> o2.getBookId() - o1.getBookId());
		return books;
	}

	public static void main(String[] args) {

		BookService bookService = new BookService();
		List<Book> bookList = bookService.getBooksInSorted();
		for (Book b : bookList) {
			System.out.println(b);
		}
	}

}
