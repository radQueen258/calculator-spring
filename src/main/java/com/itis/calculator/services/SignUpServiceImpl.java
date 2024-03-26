package com.itis.calculator.services;

import com.itis.calculator.dto.SignUpDto;
import com.itis.calculator.models.Role;
import com.itis.calculator.models.User;
import com.itis.calculator.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SignUpServiceImpl implements SignUpService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User addUser(SignUpDto signUpDto) {
        User user = User.builder()
                .username(signUpDto.getUsername())
                .email(signUpDto.getEmail())
                .password(passwordEncoder.encode(signUpDto.getPassword()))
                .confirmed("CONFIRMED")
                .role(Role.USER)
                .build();
        return userRepository.save(user);
    }
}
