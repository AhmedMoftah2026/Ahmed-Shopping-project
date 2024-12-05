package com.ahmed.shopping.model;


import java.util.Date;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "SH_ORDER")
@Data
public class Order {
	
    @Id
	private Long id ;
	private String name ;	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date date ;
	private Long qty ;
	
	private Product product;

	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Long id, String name, Date date, Long qty, Product product) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.qty = qty;
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getQty() {
		return qty;
	}

	public void setQty(Long qty) {
		this.qty = qty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
}
