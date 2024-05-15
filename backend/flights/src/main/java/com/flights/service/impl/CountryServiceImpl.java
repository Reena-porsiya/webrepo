// CountryServiceImpl.java
package com.flights.service.impl;

import com.flights.Repository.CountryRepository;
import com.flights.entity.CountryEntity;
import com.flights.service.CountryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public String createCountry(CountryEntity country) {
        countryRepository.save(country);
        return "Country created successfully";
    }

    @Override
    public List<CountryEntity> getAllCountry() {
        return countryRepository.findAll();
	}
    @Override
    public void updateCountry(CountryEntity country) {
        countryRepository.save(country);
    }
    @Override
    public boolean existsById(String iataCountryCode) {
        return countryRepository.existsById(iataCountryCode);
    }
    
    @Override
    public void deleteCountry(String iataCountryCode) {
        countryRepository.deleteById(iataCountryCode);
    }
    
    @Override
    public void deleteCountryByName(String name) {
        countryRepository.deleteById(name);
    }
}
