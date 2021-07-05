package com.ahfes.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Place implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlace;
	private String name;
	@Column(length = 5000)
	private String description;
	@OneToMany(mappedBy = "place")
	private List<PlacePicture> picture;
	private String homePicture;
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Place(Long idPlace, String name, String description, List<PlacePicture> picture, String homePicture) {
		super();
		this.idPlace = idPlace;
		this.name = name;
		this.description = description;
		this.picture = picture;
		this.homePicture = homePicture;
	}
	public Long getIdPlace() {
		return idPlace;
	}
	public void setIdPlace(Long idPlace) {
		this.idPlace = idPlace;
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
	public List<PlacePicture> getPicture() {
		return picture;
	}
	public void setPicture(List<PlacePicture> picture) {
		this.picture = picture;
	}
	public String getHomePicture() {
		return homePicture;
	}
	public void setHomePicture(String homePicture) {
		this.homePicture = homePicture;
	}
	
}
