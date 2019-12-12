package com.docsconsole.tutorials.hibernate5.entity;

public class Book {

	public Book() {
	}

	public Book(String bookName, Double bookPrice, Author author) {

		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.author = author;

	}

	private Long bookId;

	private String bookName;

	private Double bookPrice;

	private Author author;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}