package com.dv.dscommerce.dto;

import com.dv.dscommerce.entities.Product;

public class ProductMinDTO {

	private Long id;
	private String name;
	private Double price;
	private String imgUrl;
	
	public ProductMinDTO(Long id, String name, Double price, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgUrl = imgUrl;
	}

	public ProductMinDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getImgUrl() {
		return imgUrl;
	}


	
}
