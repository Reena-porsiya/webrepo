package com.flights.business.impl;


import org.springframework.stereotype.Service;

import com.flights.business.UserBusiness;
import com.flights.entity.UserEntity;
import com.flights.service.UserService;

@Service
public class UserBusinessImpl implements UserBusiness {

    private  UserService userService;

   
    public UserBusinessImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserEntity getUserDetails(String username, String password) {
        return userService.getUserByUsernameAndPassword(username, password);
    }
}
