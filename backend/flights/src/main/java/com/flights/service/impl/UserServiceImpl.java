package com.flights.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.Repository.UserRepository;
import com.flights.entity.UserEntity;
import com.flights.service.UserService;


import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        // Implement user authentication logic using UserRepository
        // For simplicity, assuming UserRepository provides a method like findByUsernameAndPassword
        // You might want to handle password hashing and other security aspects in a real-world scenario
        return userRepository.findByUsernameAndPassword(username, password).isPresent();
    }
}
