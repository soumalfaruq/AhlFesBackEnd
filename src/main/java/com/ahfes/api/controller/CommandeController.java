package com.ahfes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahfes.api.model.Food;
import com.ahfes.api.model.FoodType;
import com.ahfes.api.model.ProductCategory;
import com.ahfes.api.repository.FoodRepository;
import com.ahfes.api.repository.FoodTypeRepository;
import com.ahfes.api.repository.ProductCategoryRepositorty;
import com.fasterxml.jackson.annotation.JsonIgnore;
@RestController
@CrossOrigin("*")
public class CommandeController {

	@Autowired
	FoodRepository food;
	
	@Autowired
	FoodTypeRepository type;
	@Autowired
	ProductCategoryRepositorty pc;
	
	@GetMapping(value = "/foodorder")
	public List<Food> listFood() {
		return food.findByOrderByNbrVente();
	}
	@GetMapping(value = "/productcategory")
	public List<ProductCategory> listProductCategory() {
		return pc.findAll();
	}
	
	@GetMapping(value = "/typefood")
	public List<FoodType> typeFood() {
		return type.findAll();
	}
	
	@GetMapping(value = "/food")
	public List<Food> foods() {
		return food.findAll();
	}
}
