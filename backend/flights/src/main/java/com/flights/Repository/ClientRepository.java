package com.flights.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flights.model.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}