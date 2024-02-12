package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="party_seq",initialValue = 1,allocationSize = 1)
@Table(name="tbl_party")
public class Party {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "party_seq")
	@Column(name="party_id")
	private Integer party_id;
	
	
	@Column(name="party_name")
	private String party_name;


	public Integer getParty_id() {
		return party_id;
	}


	public void setParty_id(Integer party_id) {
		this.party_id = party_id;
	}


	public String getParty_name() {
		return party_name;
	}


	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
	
	

}
