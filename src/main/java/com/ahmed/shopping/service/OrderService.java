package com.ahmed.shopping.service;

import java.util.List;

import com.ahmed.shopping.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.shopping.model.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository ;
	
	
	public Order findById (Long id) {
		return orderRepository.findById(id).orElse(null);
	}
	
	public List<Order> findAll () {
		return orderRepository.findAll();
	}
	
	public Order save (Order Order) {
		Log.info("order is is " + Order.getId());
		return orderRepository.save(Order);
	}

}
