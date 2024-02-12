package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vendor;
import com.example.demo.service.VendorService;

@RestController
@RequestMapping("vendor")
public class VendorRestController {

	@Autowired
	VendorService vendorserv;
	
	
	@PostMapping("/")
	public ResponseEntity<Vendor> saveVendor(@RequestBody Vendor vendor ) {	
		Vendor vend = vendorserv.saveVendor(vendor);
		
		if(vend!=null) {
			return new ResponseEntity<Vendor>(vend,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Vendor>> viewVendors() {
		return new ResponseEntity<List<Vendor>>(vendorserv.getAllVendors(),HttpStatus.OK);
	}
	
		
	@PutMapping("/")
	public ResponseEntity<Vendor> updateVendor(@RequestBody Vendor vend )
	{
		int val = vendorserv.updateVendorById(vend);
		
		if(val > 0 ) {
			return new ResponseEntity<Vendor>(vend , HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Vendor>(HttpStatus.NOT_MODIFIED);
		}
	}
}
