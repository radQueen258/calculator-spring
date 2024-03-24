package com.itis.calculator.services;

import com.itis.calculator.dto.CalculatorDto;
import com.itis.calculator.dto.CalculatorForm;
import com.itis.calculator.models.Calculator;

import java.util.List;

public interface CalculatorService {
    public void operation(CalculatorForm form);

    List<CalculatorDto> getByCalculatorId (Long calculationId);
}
