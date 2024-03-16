package com.itis.calculator.services;

import com.itis.calculator.models.Calculator;
import com.itis.calculator.repositories.CalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceImpl implements CalculatorService{

    @Autowired
    private CalculatorRepository calculatorRepository;


    @Override
    public Calculator addition(double num1, double num2) {
        Calculator calculator = new Calculator();
        calculator.setOperation("+");
        calculator.setResult(num1 + num2);
        return calculatorRepository.save(calculator);
    }
}
