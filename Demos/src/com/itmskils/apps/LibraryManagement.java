package com.itmskils.apps;

import java.time.LocalDate;

import com.itmskils.entities.Book;

public class LibraryManagement {
	
	public static void main(String[] args) {
		
		Book b1 = new Book(111,"Tao Of Physics","IBN5454",LocalDate.of(2000, 4,5),454.00,"Fritzof capra");
		
		System.out.println(b1);
		
		
		
	}

}
