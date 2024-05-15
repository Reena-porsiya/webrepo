// CountryBusinessImpl.java
package com.flights.business.impl;

import com.flights.business.CountryBusiness;
import com.flights.entity.CountryEntity;
import com.flights.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryBusinessImpl implements CountryBusiness {

    @Autowired
    private CountryService countryService;

    @Override
    public String createCountry(CountryEntity country) {
        return countryService.createCountry(country);
    }
    @Override
    public String updateCountry(CountryEntity country) {
        countryService.updateCountry(country);
        return "Country updated successfully";
    }
    @Override
    public void deleteCountry(String iataCountryCode) {
        countryService.deleteCountry(iataCountryCode);
    }
    @Override
    public void deleteCountryByName(String name) {
        countryService.deleteCountry(name);
    }
}
