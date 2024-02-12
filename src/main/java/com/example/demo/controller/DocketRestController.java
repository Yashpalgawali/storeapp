package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.Docket;
import com.example.demo.model.Party;
import com.example.demo.service.DocketService;
import com.example.demo.service.PartyService;

@RestController
@RequestMapping("docket")
public class DocketRestController {

	@Autowired
	DocketService dockserv;
	
	@Autowired
	PartyService partyserv;
	

	
	@RequestMapping("/savedocket")
	public ResponseEntity<Docket> saveDocket(@ModelAttribute("Docket")Docket dock,RedirectAttributes attr)
	{
		Docket docket = dockserv.saveDocket(dock);
		if(docket!=null) {
			return new ResponseEntity<Docket>(docket , HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	@GetMapping("/")
	public ResponseEntity<List<Docket>> viewDocket(Model model)
	{
		List<Docket> dlist = dockserv.getAllDocketsWithJoin();
		return new ResponseEntity<List<Docket>>(dlist,HttpStatus.OK);
	}
	
	
	@PutMapping("/")
	public ResponseEntity<Docket> updateDocket(@RequestBody Docket dock ) {
		int value = dockserv.updateDocket(dock);
		
		if(value > 0 ) {
			return new ResponseEntity<Docket>(dock,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		}
	}
	
}
