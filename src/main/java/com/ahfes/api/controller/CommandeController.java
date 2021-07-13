package com.ahfes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahfes.api.model.Commande;
import com.ahfes.api.model.Food;
import com.ahfes.api.model.FoodType;
import com.ahfes.api.model.Product;
import com.ahfes.api.model.ProductCategory;
import com.ahfes.api.model.TypeProduct;
import com.ahfes.api.repository.CommandeRepository;
import com.ahfes.api.repository.FoodRepository;
import com.ahfes.api.repository.FoodTypeRepository;
import com.ahfes.api.repository.ProductCategoryRepositorty;
import com.ahfes.api.repository.ProductRepository;
import com.ahfes.api.repository.TypeProductRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
@RestController
@CrossOrigin("*")
public class CommandeController {

	@Autowired
	FoodRepository food;
	@Autowired
	CommandeRepository commande;
	@Autowired
	FoodTypeRepository type;
	@Autowired
	TypeProductRepository pt;
	@Autowired
	ProductRepository p;
	
	@GetMapping(value = "/foodorder")
	public List<Food> listFood() {
		return food.findByOrderByNbrVente();
	}
	
	@GetMapping(value = "/product")
	public List<Product> listProduct() {
		return p.findAll();
	}
	
	@GetMapping(value = "/productType")
	public List<TypeProduct> listProductType() {
		return pt.findAll();
	}
	
	@GetMapping(value = "/typefood")
	public List<FoodType> typeFood() {
		return type.findAll();
	}
	
	@GetMapping(value = "/food")
	public List<Food> foods() {
		return food.findAll();
	}
	
	 @PostMapping("/commander")
	    void addUser(@RequestBody Commande c) {
		 	Commande lastCommande=commande.findTopByOrderByIdDesc();
		 	if(lastCommande.getId()!=null) {
		 	c.setNumCommande("00"+lastCommande.getId()+1+"A");
		 	}
	        commande.save(c);
	    }
	
}
