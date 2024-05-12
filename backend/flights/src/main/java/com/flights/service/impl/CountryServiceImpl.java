// CountryServiceImpl.java
package com.flights.service.impl;

import com.flights.Repository.CountryRepository;
import com.flights.entity.CountryEntity;
import com.flights.service.CountryService;
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
}
