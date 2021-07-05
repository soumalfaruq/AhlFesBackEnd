package com.ahfes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ahfes.api.model.FoodType;

@CrossOrigin("*")
@RepositoryRestResource
public interface FoodTypeRepository extends JpaRepository<FoodType, Long> {

}
