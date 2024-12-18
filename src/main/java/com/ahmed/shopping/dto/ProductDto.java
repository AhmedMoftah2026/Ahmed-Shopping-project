package com.ahmed.shopping.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDto {
	
	private Long productId ;
	private String productName ;
	private Double price ;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
