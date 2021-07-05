package com.ahfes.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
@Entity
public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "sub_category_id")
	@JsonBackReference
	private ProductSubCategory subCategory;
	private Integer quantity;
	private String picture;
	private Integer numberSeller;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, ProductSubCategory subCategory, Integer quantity, String picture,
			Integer numberSeller) {
		super();
		this.name = name;
		this.subCategory = subCategory;
		this.quantity = quantity;
		this.picture = picture;
		this.numberSeller = numberSeller;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductSubCategory getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(ProductSubCategory subCategory) {
		this.subCategory = subCategory;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getNumberSeller() {
		return numberSeller;
	}
	public void setNumberSeller(Integer numberSeller) {
		this.numberSeller = numberSeller;
	}
	
	
	
}
