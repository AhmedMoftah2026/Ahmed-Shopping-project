package com.ahmed.shopping.mapper;

import java.util.Date;
import java.util.List;

import com.ahmed.shopping.dto.OrderDto;
import com.ahmed.shopping.model.Order;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring" , collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED
  , imports = {Date.class} , uses = {ProductMapper.class})
public interface OrderMapper {
	
	@Mapping(source = "id" , target = "orderId")
	@Mapping(source = "name" , target = "orderName")
	@Mapping(source = "product.id" , target = "productId")
	@Mapping(target = "date" , expression = "java( new Date())" , ignore = true)
    OrderDto mapToDto (Order t);
	
	List<OrderDto> mapToDto (List<Order> t);
	
	
	@Mapping(source = "orderId" , target = "id")
	@Mapping(source = "orderName" , target = "name")
	Order mapToEntity (OrderDto dto);
	
	@Mapping(source = "orderId" , target = "id")
	@Mapping(source = "orderName" , target = "name")
	Order mapToUpdate (OrderDto dto ,@MappingTarget Order t);

}
