package com.ahfes.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity

public class PicturesRiad implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String picture;
	@ManyToOne
	@JoinColumn(name = "pictures_riad_id")
	private Riad riad;
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Riad getRiad() {
		return riad;
	}
	public void setRiad(Riad riad) {
		this.riad = riad;
	}
	public PicturesRiad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PicturesRiad(String picture, Riad riad) {
		super();
		this.picture = picture;
		this.riad = riad;
	}

	
	
}
