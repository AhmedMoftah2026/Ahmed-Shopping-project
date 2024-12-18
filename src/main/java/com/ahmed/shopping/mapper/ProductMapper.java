package com.ahmed.shopping.mapper;

import java.util.List;

import com.ahmed.shopping.dto.ProductDto;
import com.ahmed.shopping.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper()
public interface ProductMapper {
	
	@Mapping(source = "id" , target = "productId")
	@Mapping(source = "name" , target = "productName")
    ProductDto mapToDto (Product t);
	
	List<ProductDto> mapToDto (List<Product> t);
	
	
	@Mapping(source = "productId" , target = "id")
	@Mapping(source = "productName" , target = "name")
	Product mapToEntity (ProductDto dto);
	
	@Mapping(source = "productId" , target = "id")
	@Mapping(source = "productName" , target = "name")
	Product mapToUpdate (ProductDto dto ,@MappingTarget Product t);
	
	
	

}