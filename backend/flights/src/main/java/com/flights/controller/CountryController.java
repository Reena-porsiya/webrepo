package com.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flights.business.CountryBusiness;
import com.flights.entity.CountryEntity;

@RestController
@RequestMapping("/create")
@CrossOrigin(origins="*")
public class CountryController {
	 @Autowired
	    private CountryBusiness countryBusiness;

	    @PostMapping("/createcountry")
	    public String createCountry(@RequestBody CountryEntity country) {
	        String msg = countryBusiness.createCountry(country);
	        return msg;
	    }
	    
	
	}


