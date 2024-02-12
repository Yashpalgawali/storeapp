package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="prod_seq", initialValue = 1,allocationSize = 1)
@Table(name="tbl_product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "prod_seq")
	@Column(name="pid")
	private Long pid;

	@Column(name="prod_name")
	private String prod_name ;
	
	@Column(name="prod_price")
	private String prod_price;
	 
	@Column(name="prod_model_no")
	private String prod_model_no;
	
	@Column(name="prod_hsn")
	private Long prod_hsn;
	
	@Column(name="prod_unit")
	private String prod_unit;
	
	@Column(name="gsttax")
	private float gsttax;
	
	@Column(name="cgst_per")
	private float cgst_per;
	
	@Column(name="sgst_per")
	private float sgst_per;
	
	@Column(name="igst_per")
	private float igst_per;
	
	public float getCgst_per() {
		return cgst_per;
	}

	public void setCgst_per(float cgst_per) {
		this.cgst_per = cgst_per;
	}

	public float getSgst_per() {
		return sgst_per;
	}

	public void setSgst_per(float sgst_per) {
		this.sgst_per = sgst_per;
	}

	public float getIgst_per() {
		return igst_per;
	}

	public void setIgst_per(float igst_per) {
		this.igst_per = igst_per;
	}

	public float getGsttax() {
		return gsttax;
	}

	public void setGsttax(float gsttax) {
		this.gsttax = gsttax;
	}

	public String getProd_unit() {
		return prod_unit;
	}

	public void setProd_unit(String prod_unit) {
		this.prod_unit = prod_unit;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_price() {
		return prod_price;
	}

	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_model_no() {
		return prod_model_no;
	}

	public void setProd_model_no(String prod_model_no) {
		this.prod_model_no = prod_model_no;
	}

	public Long getProd_hsn() {
		return prod_hsn;
	}
 
	public void setProd_hsn(Long prod_hsn) {
		this.prod_hsn = prod_hsn;
	}
	
}
