package com.ahfes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ahfes.api.model.PlacePicture;
@CrossOrigin("*")
@RepositoryRestResource
public interface PlacePictureRepository extends JpaRepository<PlacePicture, Long>{

}
