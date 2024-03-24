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
    public void operation(CalculatorForm form) {
        Calculator calculator = new Calculator();
        String sign = form.getSignOp();
        System.out.println(form.getNum1());
        System.out.println(form.getNum1());
        System.out.println("THEEEE SIGN IS" + sign);
        switch (sign) {
            case "add":
                Calculator calculator1 = Calculator.builder()
                        .num1(form.getNum1())
                        .num2(form.getNum2())
                        .signOp(form.getSignOp())
                        .result(form.getNum1() + form.getNum2())
                        .build();
                calculatorRepository.save(calculator1);
                break;

            case "subtract":
                Calculator calculator2 = Calculator.builder()
                        .num1(form.getNum1())
                        .num2(form.getNum2())
                        .signOp(form.getSignOp())
                        .result(form.getNum1() - form.getNum2())
                        .build();

                calculatorRepository.save(calculator2);
                break;

            case "multiply":
                Calculator calculator3 = Calculator.builder()
                        .num1(form.getNum1())
                        .num2(form.getNum2())
                        .signOp(form.getSignOp())
                        .result(form.getNum1() * form.getNum2())
                        .build();
                calculatorRepository.save(calculator3);
                break;

            case "divide":
                Calculator calculator4 = Calculator.builder()
                        .num1(form.getNum1())
                        .num2(form.getNum2())
                        .signOp(form.getSignOp())
                        .result(form.getNum1() / form.getNum2())
                        .build();
                calculatorRepository.save(calculator4);
                break;

        }

    }

    @Override
    public List<CalculatorDto> getByCalculatorId(Long calculationId) {
        Calculator calculator = calculatorRepository.getOne(calculationId);
//        List<Calculator> calculatorList = calculator.getCalculatorId();
        return null;
    }
}
