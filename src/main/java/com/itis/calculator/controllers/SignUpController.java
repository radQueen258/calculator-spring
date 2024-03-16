package com.itis.calculator.controllers;

import com.itis.calculator.dto.SignUpDto;
import com.itis.calculator.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;


    @GetMapping("/signUp")
    public String getSignUpPage () {
        return "sign_up_page";
    }

    @PostMapping("/signUp")
    public String registerUser (SignUpDto signUpDto) {
        signUpService.addUser(signUpDto);

        return "redirect:/signUpPage";
    }
}
