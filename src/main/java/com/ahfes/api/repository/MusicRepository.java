package com.ahfes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ahfes.api.model.Music;

@RepositoryRestResource
public interface MusicRepository extends JpaRepository<Music, Long> {

}
