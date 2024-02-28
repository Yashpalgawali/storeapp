package com.storeapp.demo.service;

import java.util.List;

import com.storeapp.demo.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(Long id);
	
	public int updateProduct(Product product);
}
