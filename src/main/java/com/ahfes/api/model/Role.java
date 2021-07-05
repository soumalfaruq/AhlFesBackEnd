package com.ahfes.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

public class Role implements Serializable {

	@Id
	private Long id;
	private String role;
	private List<User> user;
}
