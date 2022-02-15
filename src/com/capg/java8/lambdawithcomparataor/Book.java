package com.capg.java8.lambdawithcomparataor;

public class Book {

	private int bookId;
	private int pages;
	private String name;

	public Book(int bookId, int pages, String name) {
		super();
		this.bookId = bookId;
		this.pages = pages;
		this.name = name;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookId() {
		return bookId;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", pages=" + pages + ", name=" + name + "]";
	}

}
