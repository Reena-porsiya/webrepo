package com.flights.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.business.CountryBusiness;
import com.flights.entity.CountryEntity;
import com.flights.service.CountryService;

@Service
public class CountryBusinessImpl implements CountryBusiness {

    @Autowired
    private CountryService countryService;

    @Override
public String createCountry(CountryEntity country) {
        
        String msg= countryService.createCountry(country);
        return msg;
    }
}
