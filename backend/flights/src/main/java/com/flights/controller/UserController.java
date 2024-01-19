package com.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.flights.business.UserBusiness;

@Controller
public class UserController {

    private final UserBusiness userBusiness;

    @Autowired
    public UserController(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(String username, String password, Model model) {
        // Call the login method from the business class
        boolean loginSuccess = userBusiness.loginUser(username, password);

        if (loginSuccess) {
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }
}
