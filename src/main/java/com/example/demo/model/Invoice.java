package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;



@Entity
@SequenceGenerator(name="invoice_seq", allocationSize = 1, initialValue = 1)
@Table(name="tbl_invoice")
public class Invoice {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO ,generator = "invoice_seq")
	@Column(name="invoice_id")
	private Long invoice_id;
	
	@Column(name="order_id")
	private Long order_id;
	
	@Column(name="invoice_no")
	private Long invoice_no;
	
	@Column(name="prefix")
	private String prefix;
	
	@Value("tidystore")
	@Column(name="store_name")
	private String store_name;
	
	
	@Value("tidystore.com")
	@Column(name="store_url")
	private String store_url;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	
	@Column(name="total_amount")
	private Float total_amount;
	
	@Column(name="date_added")
	private Date date_added;
	
	@Column(name="updated_date")
	private Date updated_date;
	
	@Column(name="vehicle")
	private String vehicle;
	
	@Column(name="batch_no")
	private String batch_no;

	@Column(name="orderponumber")
	private String orderponumber;

	public Long getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(Long invoice_id) {
		this.invoice_id = invoice_id;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Long getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(Long invoice_no) {
		this.invoice_no = invoice_no;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getStore_url() {
		return store_url;
	}

	public void setStore_url(String store_url) {
		this.store_url = store_url;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Float total_amount) {
		this.total_amount = total_amount;
	}

	public Date getDate_added() {
		return date_added;
	}

	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getBatch_no() {
		return batch_no;
	}

	public void setBatch_no(String batch_no) {
		this.batch_no = batch_no;
	}

	public String getOrderponumber() {
		return orderponumber;
	}

	public void setOrderponumber(String orderponumber) {
		this.orderponumber = orderponumber;
	}

	
	
}
