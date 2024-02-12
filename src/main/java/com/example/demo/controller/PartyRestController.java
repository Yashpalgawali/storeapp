package com.example.demo.controller;

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
import com.example.demo.model.Party;
import com.example.demo.service.PartyService;

@RestController
@RequestMapping("party")
public class PartyRestController {

	@Autowired	
	PartyService partyserv;
	
	@PostMapping("/")
	public ResponseEntity<Party> saveParty(@RequestBody Party party) {
		Party part = partyserv.saveParty(party);
		
		if(part!=null) {
			return new ResponseEntity<Party>(part ,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<Party>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/")
	public  ResponseEntity<List<Party>> viewParties() {
		return new ResponseEntity<List<Party>>(partyserv.getAllParties(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public  ResponseEntity<Party> getPartyById(@PathVariable Long id) {
		
		Party party = partyserv.getpartyById(""+id);
		if(party!=null)
			return new ResponseEntity<Party>(party, HttpStatus.OK);
		else
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
	}
	
	
	@PutMapping("/")
	public ResponseEntity<List<Party>> updateParty(@RequestBody Party party) {
		int value = partyserv.updateParty(party);
		
		if(value > 0) {
			return new ResponseEntity<List<Party>>(partyserv.getAllParties(), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<Party>>(partyserv.getAllParties(), HttpStatus.OK);
		}	
	}
	
}
