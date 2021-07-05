package com.ahfes.api.controller;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ahfes.api.repository.ProductRepository;
@CrossOrigin("*")
@RestController
public class MediaController {
	
	@Autowired
	ProductRepository product;
	
	@GetMapping(path="/images/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhoto(@PathVariable("id") String id) throws Exception{
        return Files.readAllBytes(Paths.get("src/main/resources/static/images/"+id));
    }
}
