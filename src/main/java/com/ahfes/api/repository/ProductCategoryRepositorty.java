package com.ahfes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ahfes.api.model.ProductCategory;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProductCategoryRepositorty extends JpaRepository<ProductCategory, Long> {

}
