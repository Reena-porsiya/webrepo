package com.flights.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.business.UserBusiness;
import com.flights.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserBusinessImpl implements UserBusiness {
    @Autowired
    private UserService userLoginService;

    @Override
    public String validateCredentials(String username, String password) {

	
		  String msg = userLoginService.validateLoginCredentials(username, password);
		  return msg;
	}
    
}