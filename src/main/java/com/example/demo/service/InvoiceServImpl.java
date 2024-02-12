package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repository.InvoiceRepo;

@Service("invserv")
public class InvoiceServImpl implements InvoiceService {

	@Autowired
	InvoiceRepo invrepo;
	
	@Override
	public Invoice saveInvoice(Invoice inv) {
		// TODO Auto-generated method stub
		return invrepo.save(inv);
	}

	@Override
	public Integer getMaxInvoiceNumber() {
		// TODO Auto-generated method stub
		return invrepo.getMaxInvoiceId();
	}

	@Override
	public List<Invoice> getAllInvoices() {
		// TODO Auto-generated method stub
		return invrepo.getAllInvoices();
	}

	@Override
	public Invoice getInvoiceByInvoiceId(String id) {
		// TODO Auto-generated method stub
		
		return invrepo.getInvoiceByInvoiceId(id);
	}



}
