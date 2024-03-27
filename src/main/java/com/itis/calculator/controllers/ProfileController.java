package com.itis.calculator.controllers;

import com.itis.calculator.models.User;
import com.itis.calculator.repositories.UserRepository;
import com.itis.calculator.security.details.UserDetailsImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    private final UserRepository userRepository;

    public ProfileController (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/profile")
    public String getProfile(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        User user = userRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("User with email " + username + " not found"));

        Long userId = user.getId();
        model.addAttribute("userId", userId);

        model.addAttribute("userName", userDetails.getUsername());

        return "profile_page";
    }

}
