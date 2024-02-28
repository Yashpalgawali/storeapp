package com.storeapp.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@SequenceGenerator(name="prod_seq" , initialValue = 1, allocationSize = 1)
@Table(name="tbl_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "prod_seq")
	private Long prod_id;
	
	private String prod_name;
	
	private String prod_model_no;
	
	private Float prod_price;
	
	private String prod_unit;
	
	private Float gsttax;
	
}
