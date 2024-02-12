package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice_Product;
import com.example.demo.repository.InvoiceProductRepo;

@Service("invprodserv")
public class InvoiceProductServImpl implements InvoiceProductService {

	@Autowired
	InvoiceProductRepo invprodrepo;
	
	@Override
	public Invoice_Product saveInvoiceProduct(Invoice_Product invprod) {
		// TODO Auto-generated method stub
		
		return invprodrepo.save(invprod);
	}

}
