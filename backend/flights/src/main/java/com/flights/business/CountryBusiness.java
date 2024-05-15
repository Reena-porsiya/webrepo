// CountryBusiness.java
package com.flights.business;

import com.flights.entity.CountryEntity;

public interface CountryBusiness {
    String createCountry(CountryEntity country);
    
    String updateCountry(CountryEntity country);
    void deleteCountry(String iataCountryCode);
    void deleteCountryByName(String name);
}
