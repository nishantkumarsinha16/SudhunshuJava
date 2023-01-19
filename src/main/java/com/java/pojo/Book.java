package com.java.pojo;

public class Book {

	private Integer bookId;
	private String bookTitle;
	private Float bookPrice;
	private String authorName;

	public Book(Integer bookId, String bookTitle, Float bookPrice, String authorName) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
	}

	public Book() {

	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + ", authorName="
				+ authorName + "]";
	}

}
