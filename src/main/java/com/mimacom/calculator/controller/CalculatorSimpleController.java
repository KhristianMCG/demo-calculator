package com.mimacom.calculator.controller;

import com.mimacom.calculator.model.OperationSimple;
import com.mimacom.calculator.service.CalculatorSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorSimpleController {

    private static final String OPERATION = "operation";
    private static final String RESULT = "result";
    private static final String CALCULATOR_UI = "calculator-ui";

    OperationSimple operation = new OperationSimple();

    @Autowired
    private CalculatorSimpleService calculatorSimpleService;

    @GetMapping("/calculator")
    public String getCalculatorUi(Model model) {
        model.addAttribute(OPERATION, operation);
        return CALCULATOR_UI;
    }

    @PostMapping(value = "/calculator", params = "add")
    public String add(@ModelAttribute("operation") OperationSimple operation, Model model) {
        model.addAttribute(RESULT, calculatorSimpleService.add(operation));
        return CALCULATOR_UI;
    }

    @PostMapping(value = "/calculator", params = "subtract")
    public String subtract(@ModelAttribute("operation") OperationSimple operation, Model model) {
        model.addAttribute(RESULT, calculatorSimpleService.subtract(operation));
        return CALCULATOR_UI;
    }

    @PostMapping(value = "/calculator", params = "multiply")
    public String multiply(@ModelAttribute("operation") OperationSimple operation, Model model) {
        model.addAttribute(RESULT, calculatorSimpleService.multiply(operation));
        return CALCULATOR_UI;
    }

    @PostMapping(value = "/calculator", params = "divide")
    public String divide(@ModelAttribute("operation") OperationSimple operation, Model model) {
        model.addAttribute(RESULT, calculatorSimpleService.divide(operation));
        return CALCULATOR_UI;
    }

    @PostMapping(value = "/calculator", params = "clearSimple")
    public String clearSimple(@ModelAttribute("operation") OperationSimple operation, Model model) {
        model.addAttribute(OPERATION, calculatorSimpleService.clearSimple(operation));
        model.addAttribute(RESULT, 0);
        return CALCULATOR_UI;
    }
}