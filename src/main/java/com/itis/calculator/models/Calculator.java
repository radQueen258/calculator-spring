package com.itis.calculator.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Calculator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calculatorId;

    private String signOp;
    private double num1;
    private double num2;
    private double result;

    @ManyToOne
    @JoinTable(name = "operation_user")
    @JoinColumn(name = "user_id")
    private User user;

}
