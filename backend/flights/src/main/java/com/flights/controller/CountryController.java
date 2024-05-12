// CountryController.java
package com.flights.controller;

import com.flights.entity.CountryEntity;
import com.flights.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
@CrossOrigin(origins = "*")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping("/create")
    public ResponseEntity<String> createCountry(@RequestBody CountryEntity country) {
        // Validate input if needed
        if (country.getIataCountryCode() == null || country.getName() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("IataCountryCode and Name are required");
        }

        countryService.createCountry(country);
        return ResponseEntity.status(HttpStatus.CREATED).body("Country created successfully");
    }
}
