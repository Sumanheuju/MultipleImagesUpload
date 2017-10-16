package com.vortexnepal.ghyampo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/*
 * ProductList.Class
 * -- Child Entity to Product class
 * -- Foreign Key is mapped through productId from Product class
 * -- ProductImage.class doesn't have getter for Product object to prevent from infinite loop while fetching Product Entity
 */
@Entity
@Table(name="product_images")
public class ProductImage implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="picture_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "product_id")	
	private Product product;
	
	@Column(name="name")
	private String name;
	
	public ProductImage(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
