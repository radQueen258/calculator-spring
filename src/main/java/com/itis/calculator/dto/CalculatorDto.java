package com.itis.calculator.dto;

import com.itis.calculator.models.Calculator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorDto {
    private Long calculatorId;
    private String signOp;
    private double result;
    private Long userId;

    public static CalculatorDto from(Calculator calculator) {

        Long calculatorId = calculator.getCalculatorId();
        String operation = calculator.getSignOp();
        double result = calculator.getResult();
        Long userId = calculator.getUser().getId();


        return CalculatorDto.builder()
                .userId(userId)
                .calculatorId(calculatorId)
                .signOp(operation)
                .result(result)
                .build();
    }

    public static List<CalculatorDto> calculatorDtoList(List<Calculator> calculators) {
        return calculators.stream()
                .map(CalculatorDto::from)
                .collect(Collectors.toList());
    }

}
