package com.itis.calculator.controllers;

import com.itis.calculator.dto.CalculatorDto;
import com.itis.calculator.dto.CalculatorForm;
import com.itis.calculator.models.Calculator;
import com.itis.calculator.repositories.CalculatorRepository;
import com.itis.calculator.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private CalculatorRepository calculatorRepository;

    @PostMapping("/calculator")
    @ResponseBody
    //I had the @RequestBody in here
    public String getOperation ( CalculatorForm calculatorForm) {

        calculatorService.operation(calculatorForm);

        return "redirect:/calculator/{calculator-id}";
    }
    @GetMapping("/calculator")
    public String getCalculator() {
        return "calculator_page";
    }

    @GetMapping("/calculator/{calculator-id}")
    public String getResult (@PathVariable("calculator-id") Long id, Model model, @ModelAttribute CalculatorForm form) {
        Optional<Calculator> optionalCalculator = calculatorRepository.findById(id);

        if (optionalCalculator.isPresent()) {
            Calculator calculator = optionalCalculator.get();
            model.addAttribute("result", calculator.getResult());
            return "result_page";
        } else {
            throw new IllegalArgumentException("Calculator result with ID " + id + " not found");
        }
    }
}
