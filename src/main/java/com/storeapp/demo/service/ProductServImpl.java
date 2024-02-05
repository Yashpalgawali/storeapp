package com.storeapp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storeapp.demo.model.Product;
import com.storeapp.demo.repository.ProductRepository;

@Service("prodserv")
public class ProductServImpl implements ProductService {

	@Autowired
	ProductRepository prodrepo;
	
	@Override
	public Product saveProduct(Product product) {
		return prodrepo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return prodrepo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		Product prd = prodrepo.findById(id).get();
		if(prd!=null)
			return prd;
		else
			return prd;
	}

	@Override
	public int updateProduct(Product product) {
		return prodrepo.updateProductById(product.getProd_name(), product.getProd_model_no(), product.getProd_price(), product.getProd_unit(), product.getGsttax(), product.getProd_id());
	}

}
