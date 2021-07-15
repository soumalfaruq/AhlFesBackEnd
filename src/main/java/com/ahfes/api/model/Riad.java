package com.ahfes.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Riad implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private String phone;
	private String mail;
	private String adresse;
	private String website;
	private String picture;
	private  Integer rate;
	private Double price;
	@OneToMany(mappedBy = "riad")
	private List<PicturesRiad> pictures;
	public Riad() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public List<PicturesRiad> getPictures() {
		return pictures;
	}
	public void setPictures(List<PicturesRiad> pictures) {
		this.pictures = pictures;
	}
	
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Riad(String name, String description, String phone, String mail, String adresse, String website,
			String picture, Integer rate, Double price, List<PicturesRiad> pictures) {
		super();
		this.name = name;
		this.description = description;
		this.phone = phone;
		this.mail = mail;
		this.adresse = adresse;
		this.website = website;
		this.picture = picture;
		this.rate = rate;
		this.price = price;
		this.pictures = pictures;
	}
}
