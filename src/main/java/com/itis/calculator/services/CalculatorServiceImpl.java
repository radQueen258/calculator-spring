package com.itis.calculator.services;

import com.itis.calculator.dto.CalculatorDto;
import com.itis.calculator.dto.CalculatorForm;
import com.itis.calculator.models.Calculator;
import com.itis.calculator.models.User;
import com.itis.calculator.repositories.CalculatorRepository;
import com.itis.calculator.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CalculatorServiceImpl implements CalculatorService{

    @Autowired
    private CalculatorRepository calculatorRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Long operation(Long userId, CalculatorForm form) {
        User user = userRepository.getOne(userId);
        String sign = form.getSignOp();
        Long calculationId = null;

        switch (sign) {
            case "add":
                Calculator calculator1 = Calculator.builder()
                        .user(user)
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
                        .user(user)
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
                        .user(user)
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
                        .user(user)
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

    @Override
    public List<CalculatorDto> getByUser(Long id) {
        User user = userRepository.getOne(id);
        List<Calculator> calculatorList = user.getCreatedCalculations();
        return CalculatorDto.calculatorDtoList(calculatorList);
    }

    @Override
    public CalculatorDto getByCalculatoraId(Long id) {
        Optional<Calculator> optionalCalculator = calculatorRepository.findById(id);
        if (optionalCalculator.isPresent()) {
            Calculator calculator = optionalCalculator.get();
            return new CalculatorDto(calculator.getCalculatorId(), calculator.getSignOp(), calculator.getResult(),calculator.getUser().getId());
        } else {
            return null;
        }

    }
}
