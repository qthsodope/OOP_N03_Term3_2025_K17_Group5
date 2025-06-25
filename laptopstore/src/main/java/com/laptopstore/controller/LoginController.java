package com.laptopstore.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/redirect")
    public String redirect(Authentication auth) {
        if (auth.getAuthorities().toString().contains("ADMIN")) {
            return "redirect:/admin/laptops";
        } else {
            return "redirect:/client/laptops";
        }
    }
}