package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@SequenceGenerator(name="invoice_prod_seq" , initialValue = 1, allocationSize = 1)
@Table(name="tbl_invoice_product")
public class Invoice_Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "invoice_prod_seq")
	@Column(name="inv_prod_id")
	private int inv_prod_id;
	
	
	private int qty;
	
	private float price;
	
	private float subtotal;
	
	private float total;
	
	private float cgst;
	
	private float sgst;
	
	private float igst;
	
	private int cgst_per;
	
	private int sgst_per;
	
	private int igst_per;
	
//	@ManyToOne
//	@JoinColumn(name="tmp_invoice_id")
//	private Temp_Invoice temp_invoice;
	
	
	private String order_id;
	
	

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	@ManyToOne
	@JoinColumn(name="prod_id")
	private Product product;
	
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getInv_prod_id() {
		return inv_prod_id;
	}

	public void setInv_prod_id(int inv_prod_id) {
		this.inv_prod_id = inv_prod_id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getCgst() {
		return cgst;
	}

	public void setCgst(float cgst) {
		this.cgst = cgst;
	}

	public float getSgst() {
		return sgst;
	}

	public void setSgst(float sgst) {
		this.sgst = sgst;
	}

	public float getIgst() {
		return igst;
	}

	public void setIgst(float igst) {
		this.igst = igst;
	}

	public int getCgst_per() {
		return cgst_per;
	}

	public void setCgst_per(int cgst_per) {
		this.cgst_per = cgst_per;
	}

	public int getSgst_per() {
		return sgst_per;
	}

	public void setSgst_per(int sgst_per) {
		this.sgst_per = sgst_per;
	}

	public int getIgst_per() {
		return igst_per;
	}

	public void setIgst_per(int igst_per) {
		this.igst_per = igst_per;
	}

//	public Temp_Invoice getTemp_invoice() {
//		return temp_invoice;
//	}
//
//	public void setTemp_invoice(Temp_Invoice temp_invoice) {
//		this.temp_invoice = temp_invoice;
//	}
	
	
	

}
