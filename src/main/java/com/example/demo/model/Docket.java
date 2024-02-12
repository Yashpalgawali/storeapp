package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="docket_seq",initialValue = 1,allocationSize = 1)
@Table(name="tbl_docket")
public class Docket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "docket_seq")
	@Column(name="docket_id")
	private Integer docket_id;
	
	@Column(name="docket_num")
	private Long docket_num;
	
	@Column(name="order_id")
	private Long order_id;
	
	@Column(name="cust_name")
	private String cust_name;
	
	
	@ManyToOne
	@JoinColumn(name="party_id")
	private Party party;


	public Integer getDocket_id() {
		return docket_id;
	}


	public void setDocket_id(Integer docket_id) {
		this.docket_id = docket_id;
	}


	public Long getDocket_num() {
		return docket_num;
	}


	public void setDocket_num(Long docket_num) {
		this.docket_num = docket_num;
	}


	public Long getOrder_id() {
		return order_id;
	}


	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}


	public String getCust_name() {
		return cust_name;
	}


	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}


	public Party getParty() {
		return party;
	}


	public void setParty(Party party) {
		this.party = party;
	}

	
	
}
