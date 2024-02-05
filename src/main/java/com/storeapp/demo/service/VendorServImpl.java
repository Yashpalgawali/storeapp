package com.storeapp.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.storeapp.demo.model.Vendor;
import com.storeapp.demo.repository.VendorRepo;

@Service("vendorserv")
public class VendorServImpl implements VendorService {

	@Autowired
	VendorRepo vendorrepo;
	
	@Override
	public Vendor saveVendor(Vendor vendor) {
		return vendorrepo.save(vendor);
	}

	@Override
	public List<Vendor> getAllVendors() {
		return vendorrepo.findAll();
	}

	@Override
	public int updateVendor(Vendor vendor) {
		return vendorrepo.updateVendor(vendor.getVendor_name(), vendor.getVendor_email(), vendor.getVendor_contact(), vendor.getVendor_address(), vendor.getState(),vendor.getCity(), vendor.getPincode(), vendor.getGstno(), vendor.getVendor_id());
	}

	@Override
	public Vendor getVendorById(Long id) {
		Optional<Vendor> vend = vendorrepo.findById(id);
		if(!vend.isEmpty())
			return vend.get();
		else
			return null;
	}

}
