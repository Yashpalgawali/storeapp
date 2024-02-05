package com.storeapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storeapp.demo.model.Vendor;
import com.storeapp.demo.service.VendorService;

@RestController
@RequestMapping("vendor")
public class VendorController {

	@Autowired
	VendorService vendserv;
	
	@PostMapping("/")
	public ResponseEntity<Vendor> saveVendor(@RequestBody Vendor vendor)
	{
		Vendor vend = vendserv.saveVendor(vendor);
		if(vend!=null)
		{
			return new ResponseEntity<Vendor>(vend,HttpStatus.OK);
		}
		else
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Vendor>> getAllVendors()
	{
		List<Vendor> vlist = vendserv.getAllVendors();
		if(vlist.size()>0)
			return new ResponseEntity<List<Vendor>>(vlist ,HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Vendor> getVendorById(@PathVariable Long id)
	{
		Vendor vend = vendserv.getVendorById(id);
		
		if(vend!=null)
			return new ResponseEntity<Vendor>(vend ,HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/")
	public ResponseEntity<List<Vendor>> updateVendor(@RequestBody Vendor vendor)
	{
		int res = vendserv.updateVendor(vendor);
		if(res>0)
		{
			return new ResponseEntity<List<Vendor>>(vendserv.getAllVendors(),HttpStatus.OK);
		}
		else
			return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
	}
}
