package com.ahfes.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ahfes.api.model.Food;
@CrossOrigin("*")
@RepositoryRestResource
public interface FoodRepository extends JpaRepository<Food, Long> {

		@RestResource(path = "/foodVente")
	    public List<Food> findByOrderByNbrVente();
}
