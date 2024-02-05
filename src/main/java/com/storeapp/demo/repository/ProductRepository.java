package com.storeapp.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.storeapp.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Transactional
	@Modifying
	@Query("UPDATE Product p SET p.prod_name=:pname,p.prod_model_no=:pmodel,p.prod_price=:price,p.prod_unit=:unit,p.gsttax=:tax WHERE p.prod_id=:id")
	public int updateProductById(String pname,String pmodel,float price,String unit,float tax, Long id);
}
