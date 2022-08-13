package com.capg.java8.lambdawithcomparataor;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 1) SORTING BASED ON NAME 
//(STEP-0) WITHOUT LAMBDA USING ANONYMOUS CLASS FOR PASSING COMPARATOR OBJECT TO SORT METHOD ARGUEMENT
//----------------------------------------------------------------------------------------------------
//public class BookService {
//
//	public List<Book> getBooksInSorted() {
//
//		// Getting books from DAO class
//		List<Book> books = new BookDAO().getBooks();
//
//		Collections.sort(books, new Comparator<Book>() {
//
//			@Override
//			public int compare(Book book1, Book book2) {
//				return book1.getName().compareTo(book2.getName());
//			}
//		}
//	);
//		return books;
//}
//
//	public static void main(String[] args) {
//
//		BookService bookService = new BookService();
//		List<Book> bookList = bookService.getBooksInSorted();
//		
//		for (Book b : bookList) {
//			System.out.println(b);
//		}
//	}
//}

// (step-1) USING LAMBDA 
//(take above override code separately remove and make lambda and copy paste near passing comparator object)
//------------------------------------------------------------------------------------------------------------
//public class BookService {
//
//	public List<Book> getBooksInSorted() {
//		
//		List<Book> books = new BookDAO().getBooks();
//		Collections.sort(books, (book1, book2) -> book1.getName().compareTo(book2.getName()));
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
//}

// 2) SORTING BASED ON ID USING LAMBDA
//-------------------------------------
//public class BookService {
//
//	public List<Book> getBooksInSorted() {
//
//		List<Book> books = new BookDAO().getBooks();
//
//		Collections.sort(books, (book1, book2) -> {
//
//			if (book1.getBookId() > book2.getBookId())
//				return 1;
//			else
//				return -1;
//		});
//		return books;
//		
//		// Another way using parsing
//		//--------------------------
////		Integer bookid1 = (Integer) ((Book) book1).getBookId();
////		Integer bookid2 = (Integer) ((Book) book1).getBookId();
////		return bookid1.compareTo(bookid2);
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
//}

// More simplified
//----------------
//public class BookService {
//
//	public List<Book> getBooksInSorted() {
//		
//		List<Book> books = new BookDAO().getBooks();
//		
//		Collections.sort(books, (book1, book2) -> book2.getBookId() - book1.getBookId());
//		return books;
//	}
//
//	public static void main(String[] args) {
//
//		BookService bookService = new BookService();
//		List<Book> bookList = bookService.getBooksInSorted();
//		
//		for (Book b : bookList) {
//			System.out.println(b);
//		}
//	}
//}
