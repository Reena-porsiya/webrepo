// CountryService.java
package com.flights.service;

import java.util.List;

import com.flights.entity.CountryEntity;

public interface CountryService {
    String createCountry(CountryEntity country);
     
    void updateCountry(CountryEntity country);
    
	List<CountryEntity> getAllCountry();
	boolean existsById(String iataCountryCode);
	void deleteCountry(String iataCountryCode);
	
	void deleteCountryByName(String name);
	
	CountryEntity getCountryByIataCountryCode(String iataCountryCode);
}
