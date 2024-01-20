package com.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flights.business.UserBusiness;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="*")
public class UserController {
    @Autowired
    private UserBusiness userBusiness;

    @GetMapping("/getuserslogin")
    public String validateLoginCredentials(String username, String password) {
        String msg = userBusiness.validateCredentials(username, password);
        return msg;
    }
    
}
