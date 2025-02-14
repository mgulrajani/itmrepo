package com.itmskils.entities;

import java.time.LocalDate;

public class Book {
	
	//instance variables
	private int id;
	private String title;
	private String isbn;
	private LocalDate dateOfPublishing;
	private double price;
	private String author; //as of now String , later create separate Author class
	
	
	
	public Book(int id,String title,String isbn,
			LocalDate dateOfPublishing,double price,
			String author) {
		
		this.id=id;
		this.title=title;
		this.isbn=isbn;
		this.dateOfPublishing = dateOfPublishing;
		this.price=price;
        this.author=author;
		
		
		
		
	}
	
	
	@Override
	public String toString() {
		
		return this.title +  " "+this.author + "" +this.dateOfPublishing;
	}
	
	
	
	
	
	

}
