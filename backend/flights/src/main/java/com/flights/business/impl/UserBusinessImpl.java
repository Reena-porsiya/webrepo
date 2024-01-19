package com.flights.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.business.UserBusiness;
import com.flights.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserBusinessImpl implements UserBusiness {

    private final UserService userService;

    public UserBusinessImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean loginUser(String username, String password) {
        // Implement login logic using UserService
        // For simplicity, assuming UserService provides a method like authenticateUser(username, password)
        return userService.authenticateUser(username, password);
    }
}

