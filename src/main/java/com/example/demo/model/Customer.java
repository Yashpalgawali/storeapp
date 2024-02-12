package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="cust_seq",allocationSize = 1,initialValue = 1)
@Table(name="tbl_customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator = "cust_seq")
	@Column(name="customer_id")
	private Long customer_id;
	
	@Column(name="cust_first_name")
	private String cust_first_name;
	
	@Column(name="cust_last_name")
	private String cust_last_name;
	
	@Column(name="cust_email")
	private String cust_email;
	
	@Column(name="cust_contact")
	private Long cust_contact;
	
	@Column(name="state_name")
	private String state_name;

	@Column(name="city_name")
	private String city_name;
	
	@Column(name="pincode")
	private Long pincode;
	
	@Column(name="cust_gst")
	private String cust_gst;
	
	@Column(name="cust_country")
	private String cust_country;
	
	
	@Column(name="cust_address")
	private String cust_address;
	
	

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_country() {
		return cust_country;
	}

	public void setCust_country(String cust_country) {
		this.cust_country = cust_country;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCust_first_name() {
		return cust_first_name;
	}

	public Customer() {};
	
	public Customer(Long customer_id, String cust_first_name, String cust_last_name, String cust_email,
			Long cust_contact, String state_name, String city_name, Long pincode, String cust_gst, String cust_country,
			String cust_address) {
		super();
		this.customer_id = customer_id;
		this.cust_first_name = cust_first_name;
		this.cust_last_name = cust_last_name;
		this.cust_email = cust_email;
		this.cust_contact = cust_contact;
		this.state_name = state_name;
		this.city_name = city_name;
		this.pincode = pincode;
		this.cust_gst = cust_gst;
		this.cust_country = cust_country;
		this.cust_address = cust_address;
	}

	public Customer(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", cust_first_name=" + cust_first_name + ", cust_last_name="
				+ cust_last_name + ", cust_email=" + cust_email + ", cust_contact=" + cust_contact + ", state_name="
				+ state_name + ", city_name=" + city_name + ", pincode=" + pincode + ", cust_gst=" + cust_gst
				+ ", cust_country=" + cust_country + ", cust_address=" + cust_address + "]";
	}

	public void setCust_first_name(String cust_first_name) {
		this.cust_first_name = cust_first_name;
	}

	public String getCust_last_name() {
		return cust_last_name;
	}

	public void setCust_last_name(String cust_last_name) {
		this.cust_last_name = cust_last_name;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public Long getCust_contact() {
		return cust_contact;
	}

	public void setCust_contact(Long cust_contact) {
		this.cust_contact = cust_contact;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public String getCust_gst() {
		return cust_gst;
	}

	public void setCust_gst(String cust_gst) {
		this.cust_gst = cust_gst;
	}
	
	
}
