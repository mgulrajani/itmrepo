package com.day4l.layeredarchitecture.services;

import java.util.List;

import com.day4.layeredarchitecture.entities.Category;
import com.day4.layeredarchitecture.entities.Product;
import com.day4l.layeredarchitecture.repos.ProductRepository;
import com.day4l.layeredarchitecture.repos.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService{
	
	//service talks to repo
	
	private ProductRepository repository = new ProductRepositoryImpl() ;
	

	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return repository.addProduct(p);
	}

	@Override
	public Product updateProduct(int id, Product p) {
		// TODO Auto-generated method stub
		return repository.updateProduct(id, p);
	}

	@Override
	public Product deleteProduct(int id) {
		// TODO Auto-generated method stub
		return repository.deleteProduct(id);
	}

	@Override
	public Product deleteProduct(String description) {
		// TODO Auto-generated method stub
		return repository.deleteProduct(description);
		
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return repository.getProductById(id);
	}

	@Override
	public List<Product> listAllProducts() {
		// TODO Auto-generated method stub
		return repository.listAllProducts();
	}

	@Override
	public List<Product> listProductsByCategory(Category category) {
		// TODO Auto-generated method stub
		return repository.listProductsByCategory(category);
	}

}
