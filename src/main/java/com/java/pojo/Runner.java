package com.java.pojo;

public class Runner {

	public static void main(String[] args) {
		Book b = new Book();
		Book book = new Book(123, "Java", 200f, "Nishant");
		System.out.println(book.toString());

		book.setBookPrice(500f);
		System.out.println(book.toString());

	}

}
