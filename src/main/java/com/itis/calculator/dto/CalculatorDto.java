package com.itis.calculator.dto;

import com.itis.calculator.models.Calculator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorDto {
    private Long calculatorId;
    private String signOp;
    private double result;

    public static CalculatorDto from(Calculator calculator) {

        Long calculatorId = calculator.getCalculatorId();
        String operation = calculator.getSignOp();
        double result = calculator.getResult();


        return CalculatorDto.builder()
                .calculatorId(calculatorId)
                .signOp(operation)
                .result(result)
                .build();
    }

}
