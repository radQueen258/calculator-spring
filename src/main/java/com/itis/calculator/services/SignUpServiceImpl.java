package com.itis.calculator.services;

import com.itis.calculator.dto.SignUpDto;
import com.itis.calculator.models.User;
import com.itis.calculator.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServiceImpl implements SignUpService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(SignUpDto signUpDto) {
        User user = User.builder()
                .username(signUpDto.getUsername())
                .password(signUpDto.getPassword())
                .build();
        return userRepository.save(user);
    }
}
