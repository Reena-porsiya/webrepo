package com.flights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@EntityScan(basePackages = "com.flights.entity")
public class FlightsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlightsApplication.class, args);
    }
}
