package com.ahfes.api;

import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.ahfes.api.model.Food;
import com.ahfes.api.model.FoodType;
import com.ahfes.api.model.Place;
import com.ahfes.api.repository.FoodRepository;
import com.ahfes.api.repository.FoodTypeRepository;
import com.ahfes.api.repository.PlaceRepository;
import com.ahfes.api.repository.ProductCategoryRepositorty;
import com.ahfes.api.repository.ProductRepository;
import com.ahfes.api.repository.ProductSubCategoryRepository;

@SpringBootApplication
public class AhlfesApplication implements RepositoryRestConfigurer {


	@Autowired
    private EntityManager entityManager;
	
	public static void main(String[] args) {
		SpringApplication.run(AhlfesApplication.class, args);
	}

	 @Override
	    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
	        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(e -> e.getJavaType()).collect(Collectors.toList()).toArray(new Class[0]));
	        
	    }
	

}
