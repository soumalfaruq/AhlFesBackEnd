package com.ahfes.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ahfes.api.model.Riad;
import com.ahfes.api.repository.RiadRepository;

@RestController
public class RiadController {

	@Autowired
	RiadRepository riad;
	
	
	@RequestMapping(value = "/Riads", method = RequestMethod.POST )
	public Riad save(@RequestBody Riad r) {
		return riad.save(r);
	}
}
