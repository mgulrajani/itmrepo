package com.day4l.layeredarchitecture.services;

import java.util.List;

import com.day4.layeredarchitecture.entities.Category;
import com.day4.layeredarchitecture.entities.Product;

public interface ProductService {


	public Product addProduct(Product p);
	public Product updateProduct(int id, Product p);
	public Product deleteProduct(int id);
	public Product deleteProduct(String description);
	public Product getProductById(int id);
	public List<Product> listAllProducts();
	public List<Product> listProductsByCategory(Category category);
	
	
}
