package com.ahmed.shopping.service;

import java.util.List;

import com.ahmed.shopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.shopping.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository ;
	
	public List<Product> findAll () {
		return productRepository.findAll();
	}
	
	public Product save (Product product) {
		return productRepository.save(product);
	}

}
