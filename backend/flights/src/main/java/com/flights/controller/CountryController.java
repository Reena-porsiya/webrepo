// CountryController.java
package com.flights.controller;

import com.flights.entity.CountryEntity;
import com.flights.service.CountryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/country")

public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping("/create")
    public ResponseEntity<String> createCountry(@RequestBody CountryEntity country) {
        // Validate input if needed
        if (country.getIataCountryCode() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("IataCountryCode and Name are required");
        }

        countryService.createCountry(country);
        return ResponseEntity.status(HttpStatus.CREATED).body("Country created successfully");
    }
    
    @GetMapping("/get")
    public List<CountryEntity> getAllCountry() {
        return countryService.getAllCountry();
    }
    
    @PutMapping("/update/{iata_country_code}")
    public ResponseEntity<String> updateCountry(@PathVariable("iata_country_code") String iataCountryCode, @RequestBody CountryEntity country) {
        // Check if the country with the given iata_country_code exists
        if (!countryService.existsById(iataCountryCode)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Country not found with IATA Country Code: " + iataCountryCode);
        }

        // Validate input if needed
        if (country.getIataCountryCode() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("IataCountryCode and Name are required");
        }

        // Update the country
        country.setIataCountryCode(iataCountryCode);
        countryService.updateCountry(country);

        return ResponseEntity.status(HttpStatus.OK).body("Country updated successfully");
    }
    @DeleteMapping("/delete/{iata_country_code}")
    public ResponseEntity<String> deleteCountry(@PathVariable("iata_country_code") String iataCountryCode) {
        // Check if the country with the given iata_country_code exists
        if (!countryService.existsById(iataCountryCode)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Country not found with IATA Country Code: " + iataCountryCode);
        }

        countryService.deleteCountry(iataCountryCode);
        return ResponseEntity.status(HttpStatus.OK).body("Country deleted successfully");
    }
    @DeleteMapping("/delete/{name}")
    public ResponseEntity<String> deleteCountryByName(@PathVariable("name") String name) {
        // Check if the country with the given iata_country_code exists
//        if (!countryService.existsById(name)) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Country not found with IATA Country Code: " + iataCountryCode);
//        }

        countryService.deleteCountryByName(name);
        return ResponseEntity.status(HttpStatus.OK).body("Country deleted successfully");
    }
}
