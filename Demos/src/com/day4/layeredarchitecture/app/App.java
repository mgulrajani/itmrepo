package com.day4.layeredarchitecture.app;

import com.day4.layeredarchitecture.entities.Product;
import com.day4l.layeredarchitecture.services.ProductService;
import com.day4l.layeredarchitecture.services.ProductServiceImpl;

public class App {
	public static void main(String[] args) {
		
		ProductService service = new ProductServiceImpl();
	
		System.out.println(service.listAllProducts());
		Product p1=  new Product(111,1000,"Acer");
		service.addProduct(p1);
		
	}

}
