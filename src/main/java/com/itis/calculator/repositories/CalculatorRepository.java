package com.itis.calculator.repositories;

import com.itis.calculator.models.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorRepository extends JpaRepository<Calculator, Long> {
}
