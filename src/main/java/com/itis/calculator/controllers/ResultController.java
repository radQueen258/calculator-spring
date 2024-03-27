package com.itis.calculator.controllers;

import com.itis.calculator.dto.CalculatorDto;
import com.itis.calculator.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ResultController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("user/{user-id}/calculator/{calculator-id}/result")
    public String getResult (@PathVariable("user-id") Long userId,
                             @PathVariable("calculator-id") Long calculatorId,
                             Model model) {
        CalculatorDto calculatorDto = calculatorService.getByCalculatoraId(calculatorId);

        if (calculatorDto != null) {
            model.addAttribute("result", calculatorDto.getResult());
            model.addAttribute("calId", calculatorId);
            model.addAttribute("userId", userId);
            return "result_page";
        } else {
            throw new IllegalArgumentException("Calculator result with ID: " + calculatorId + " not found");
        }
    }
}
