package com.itis.calculator.controllers;

import com.itis.calculator.dto.CalculatorDto;
import com.itis.calculator.dto.CalculatorForm;
import com.itis.calculator.models.Calculator;
import com.itis.calculator.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    private CalculatorDto dto = new CalculatorDto();

    @PostMapping("/calculator")
    @ResponseBody
    public String addition (@RequestBody CalculatorForm calculatorForm, Model model) {

      Calculator calculator = calculatorService.addition(calculatorForm.getNum1(), calculatorForm.getNum2());
      dto = new CalculatorDto();
      dto.setId(calculator.getCalculatorId());
      dto.setOperation(calculator.getOperation());
      dto.setResult(calculator.getResult());

      return "redirect:/calculator";
    }

    @GetMapping("/calculator")
    public String getCalculator() {
        return "calculator_page";
    }

    @GetMapping("/calculator/{calculator-id}")
    public String getResult (@PathVariable("calculator-id") Long id, Model model) {
        model.addAttribute("result",dto.getResult());
        return "result_page";
    }
}
