package com.productapp.dto;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import org.springframework.hateoas.RepresentationModel;

import com.productapp.repository.Product;

public class ProductDto extends RepresentationModel<ProductDto>{
	
	private Integer id;
	
	@NotNull(message = "{productDto.name.absent}")
	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "{productDto.name.invalid}")
	private String name;
	
	@NotNull(message = "{productDto.price.absent}")
	@Range(min = 100, max = 100000, message = "{productDto.price.invalid}")
	private BigDecimal price;
	
	//used to get data from ui and 
	
	public ProductDto() {
		super();
	}


	public ProductDto(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
