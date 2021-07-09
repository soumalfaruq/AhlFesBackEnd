package com.ahfes.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
@Entity
public class TypeProduct implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "type")
	@JsonManagedReference
	private List<ProductCategory> category;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ProductCategory> getCategory() {
		return category;
	}
	public void setCategory(List<ProductCategory> category) {
		this.category = category;
	}
	public TypeProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeProduct(String name, List<ProductCategory> category) {
		super();
		this.name = name;
		this.category = category;
	}
	
	
	
}
