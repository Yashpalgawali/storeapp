package com.storeapp.demo.service;

import java.util.List;

import com.storeapp.demo.model.Vendor;

public interface VendorService {

	public Vendor saveVendor(Vendor vendor);
	
	public List<Vendor> getAllVendors();
	
	public int updateVendor(Vendor vendor);
	
	public Vendor getVendorById(Long id);
	
	
}
