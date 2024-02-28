package com.storeapp.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_vendor")
@SequenceGenerator(name="vendor_seq",initialValue = 1,allocationSize = 1)
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "vendor_seq")
	private Long vendor_id;
	
	private String vendor_name;
	
	private String vendor_email;
	
	private Long vendor_contact;
	
	private String vendor_address;
	
	private String state;
	
	private String city;
	
	private long pincode;
	
	private String gstno;
	
}
