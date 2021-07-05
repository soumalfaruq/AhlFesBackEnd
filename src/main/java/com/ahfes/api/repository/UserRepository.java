package com.ahfes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ahfes.api.model.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long>{

}
