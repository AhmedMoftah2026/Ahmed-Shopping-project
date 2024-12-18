package com.ahmed.shopping.controller;



import java.util.List;

import com.ahmed.shopping.dto.OrderDto;
import com.ahmed.shopping.service.OrderService;
import com.ahmed.shopping.mapper.OrderMapper;
import com.ahmed.shopping.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
	
	private final OrderService orderService ;
	
	private final OrderMapper orderMapper ;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<OrderDto> findById(@PathVariable() Long id) {
		OrderDto dto = orderMapper.mapToDto(orderService.findById(id));
		return ResponseEntity.ok(dto) ;
	}
	
	@GetMapping("/order")
	public ResponseEntity<List<OrderDto>> findAll() {
		
		List<OrderDto> dtos = orderMapper.mapToDto(orderService.findAll());
		
		return new ResponseEntity<List<OrderDto>>( dtos , HttpStatus.OK )  ;
	}
	
	@PostMapping("/order")
	public ResponseEntity<OrderDto> save (@RequestBody OrderDto dto){
		
		Order order = orderMapper.mapToEntity(dto) ;
		
		OrderDto dtos = orderMapper.mapToDto(orderService.save(order));
		
		return new ResponseEntity<OrderDto> ( dtos , HttpStatus.OK);
	}
	
	@PutMapping("/order")
	public ResponseEntity<OrderDto> update (@RequestBody OrderDto dto){
		
		Order order = orderService.findById(dto.getOrderId());
		
		Order mappedOrder = orderMapper.mapToUpdate(dto, order);
		
		OrderDto dtos = orderMapper.mapToDto(orderService.save(mappedOrder));
		
		return new ResponseEntity<OrderDto> ( dtos , HttpStatus.OK);
	}
	

}
