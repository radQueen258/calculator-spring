package com.itis.calculator.services;

import com.itis.calculator.dto.SignUpDto;
import com.itis.calculator.models.User;

public interface SignUpService {
    User addUser (SignUpDto signUpDto);
}
