package com.itis.calculator.services;

import com.itis.calculator.dto.CalculatorDto;
import com.itis.calculator.dto.CalculatorForm;
import com.itis.calculator.models.Calculator;
import com.itis.calculator.models.User;

import java.util.List;

public interface CalculatorService {
    public Long operation(Long userId, CalculatorForm form);

    List<CalculatorDto> getByUser(Long id);
}
