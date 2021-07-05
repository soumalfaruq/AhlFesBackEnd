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
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Food implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private int quantity;
	private int nbrVente;
	@ManyToOne
	@JoinColumn(name="food_type_id")
	@JsonBackReference
	private FoodType type;
	private String FoodPicture;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public FoodType getType() {
		return type;
	}
	public void setType(FoodType type) {
		this.type = type;
	}
	public String getFoodPicture() {
		return FoodPicture;
	}
	public void setFoodPicture(String foodPicture) {
		FoodPicture = foodPicture;
	}
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNbrVente() {
		return nbrVente;
	}
	public void setNbrVente(int nbrVente) {
		this.nbrVente = nbrVente;
	}
	public Food(String name, String description, int quantity, int nbrVente, FoodType type, String foodPicture) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.nbrVente = nbrVente;
		this.type = type;
		FoodPicture = foodPicture;
	}
	
	
}
