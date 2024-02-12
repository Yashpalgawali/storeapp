package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="taxrate_seq",allocationSize = 1,initialValue = 1)
@Table(name="tbl_gsttaxrate")
public class GstTaxRate {

	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator = "taxrate_seq")
	@Column(name="gstid")
	private Integer gstid;
	
	@Column(name="taxrate")
	private Float taxrate;
	
	@Column(name="type")
	private String type;

	public Integer getGstid() {
		return gstid;
	}

	public void setGstid(Integer gstid) {
		this.gstid = gstid;
	}

	public Float getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(Float taxrate) {
		this.taxrate = taxrate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
