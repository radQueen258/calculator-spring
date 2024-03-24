package com.itis.calculator.services;

import com.itis.calculator.dto.CalculatorDto;
import com.itis.calculator.dto.CalculatorForm;
import com.itis.calculator.models.Calculator;
import com.itis.calculator.repositories.CalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CalculatorServiceImpl implements CalculatorService{

    @Autowired
    private CalculatorRepository calculatorRepository;


    @Override
    public Long operation(CalculatorForm form) {
        String sign = form.getSignOp();
        Long calculationId = null;

        switch (sign) {
            case "add":
                Calculator calculator1 = Calculator.builder()
                        .num1(form.getNum1())
                        .num2(form.getNum2())
                        .signOp(form.getSignOp())
                        .result(form.getNum1() + form.getNum2())
                        .build();
               Calculator saved = calculatorRepository.save(calculator1);
               calculationId = saved.getCalculatorId();
                break;

            case "subtract":
                Calculator calculator2 = Calculator.builder()
                        .num1(form.getNum1())
                        .num2(form.getNum2())
                        .signOp(form.getSignOp())
                        .result(form.getNum1() - form.getNum2())
                        .build();

                Calculator saved2 = calculatorRepository.save(calculator2);
                calculationId = saved2.getCalculatorId();
                break;

            case "multiply":
                Calculator calculator3 = Calculator.builder()
                        .num1(form.getNum1())
                        .num2(form.getNum2())
                        .signOp(form.getSignOp())
                        .result(form.getNum1() * form.getNum2())
                        .build();
                Calculator saved3 = calculatorRepository.save(calculator3);
                calculationId = saved3.getCalculatorId();
                break;

            case "divide":
                Calculator calculator4 = Calculator.builder()
                        .num1(form.getNum1())
                        .num2(form.getNum2())
                        .signOp(form.getSignOp())
                        .result(form.getNum1() / form.getNum2())
                        .build();
                Calculator saved4 = calculatorRepository.save(calculator4);
                calculationId = saved4.getCalculatorId();
                break;

        }

        return calculationId;

    }

}
