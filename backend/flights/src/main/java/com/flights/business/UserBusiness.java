package com.flights.business;

import com.flights.entity.UserEntity;
public interface UserBusiness {
    UserEntity getUserDetails(String username, String password);
}
