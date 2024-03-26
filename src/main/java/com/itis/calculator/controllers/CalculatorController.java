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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private CalculatorRepository calculatorRepository;

    @PostMapping("/user/{user-id}/calculator")
    public String getOperation (@PathVariable("user-id") Long id,CalculatorForm calculatorForm, RedirectAttributes redirectAttributes) {
        System.out.println("PASSEEEEEEEEEEED the userId " + id);

        Long calculationId = calculatorService.operation(id,calculatorForm);

        System.out.println("the calculator " + calculationId);
        redirectAttributes.addAttribute("calculator-id", calculationId);

        return "redirect:/user/" + id +"/calculator/" + calculationId;
    }
    @GetMapping("/user/{user-id}/calculator")
    public String getCalculator(@PathVariable("user-id") Long id, Model model) {
        model.addAttribute("calculation", calculatorService.getByUser(id));
        return "calculator_page";
    }

    @GetMapping("/user/{user-id}/calculator/{calculator-id}")
    public String getResult (@PathVariable("calculator-id") Long id,
                             @PathVariable("user-id") Long userId,
                             Model model,
                             @ModelAttribute CalculatorForm form) {

        CalculatorDto calculatorDto = calculatorService.getByCalculatoraId(id);
        if (calculatorDto != null) {
            model.addAttribute("result", calculatorDto.getResult());
            return "result_page";
        } else {
            throw new IllegalArgumentException("Calculator result with ID " + id + " not found");
        }
//        if (optionalCalculator.isPresent()) {
//            Calculator calculator = optionalCalculator.get();
//            model.addAttribute("result", calculator.getResult());
//            return "result_page";
//        } else {
//            throw new IllegalArgumentException("Calculator result with ID " + id + " not found");
//        }
    }
}
