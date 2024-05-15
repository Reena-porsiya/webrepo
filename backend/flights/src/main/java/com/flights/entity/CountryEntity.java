// CountryEntity.java
package com.flights.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "country")
public class CountryEntity {

    @Id
    @Column(name = "iata_country_code", columnDefinition = "CHAR(2)")
    @NotNull
    private String iataCountryCode;

    @Column(name = "name")
    private String name;

    public String getIataCountryCode() {
        return iataCountryCode;
    }

    public void setIataCountryCode(String iataCountryCode) {
        this.iataCountryCode = iataCountryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	
}
