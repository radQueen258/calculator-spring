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
        if (calculator == null) {
            // Handle the case where calculator is null
            // For example, throw an exception or return a default CalculatorDto
            throw new IllegalArgumentException("Calculator object cannot be null");
        }

        System.out.println("THE OPERATION IS: " +calculator.getSignOp());
        System.out.println("THE ID IS: " +calculator.getCalculatorId());
        System.out.println("THE RESULT IS: " +calculator.getResult());
        System.out.println("THE NUM1 IS: " +calculator.getNum1());
        System.out.println("THE NUM2 IS: " +calculator.getNum2());


        Long calculatorId = calculator.getCalculatorId();
        String operation = calculator.getSignOp();
        double result = calculator.getResult();

        if (operation == null) {
            // Handle the case where operation is null
            // For example, set a default value or throw an exception
            throw new IllegalArgumentException("Operation cannot be null");
        }

        // Assuming calculatorId is not nullable in your database schema
        if (calculatorId == null) {
            throw new IllegalArgumentException("Calculator ID cannot be null");
        }

        return CalculatorDto.builder()
                .calculatorId(calculatorId)
                .signOp(operation)
                .result(result)
                .build();
    }

}
