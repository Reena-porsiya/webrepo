package com.flights.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flights.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}