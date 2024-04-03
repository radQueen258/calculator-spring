package com.itis.calculator.models;

import lombok.*;

import javax.persistence.*;
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

    @ToString.Exclude
    @ManyToOne
    private User user;
//    @JoinTable(name = "operation_user")
//    @JoinColumn(name = "user_id")


}
