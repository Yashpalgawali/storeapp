package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Invoice_Product;

@Repository("invprodrepo")
public interface InvoiceProductRepo extends JpaRepository<Invoice_Product, Integer> {

	
	
}
