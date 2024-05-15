package com.flights.service;

import com.flights.entity.UserEntity;



public interface UserService {
    UserEntity getUserByUsernameAndPassword(String username, String password);
}
