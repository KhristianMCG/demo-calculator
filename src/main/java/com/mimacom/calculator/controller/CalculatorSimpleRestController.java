package com.mimacom.calculator.controller;

import com.mimacom.calculator.exception.ExceptionCalculator;
import com.mimacom.calculator.service.CalculatorRestControllerSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.math.BigDecimal;

@RestController
@RequestMapping("/calculator")
public class CalculatorSimpleRestController {

    public static final String APPLICATION_JSON = "application/json";
    @Autowired
    private CalculatorRestControllerSimpleService calculatorRestControllerSimpleService;

    @PostMapping(value = "/add/{valuea}/{valueb}", produces = APPLICATION_JSON)
    public ResponseEntity<BigDecimal> add(@PathVariable String valuea, @PathVariable String valueb) {
        return new ResponseEntity<>(calculatorRestControllerSimpleService.add(valuea, valueb), HttpStatus.OK);
    }

    @PostMapping(value = "/subtract/{valuea}/{valueb}" , produces = APPLICATION_JSON)
    public ResponseEntity<BigDecimal> subtract(@PathVariable String valuea, @PathVariable String valueb) {
        return new ResponseEntity<>(calculatorRestControllerSimpleService.subtract(valuea, valueb), HttpStatus.OK);
    }

    @PostMapping(value = "/multiply/{valuea}/{valueb}" , produces = APPLICATION_JSON)
    public ResponseEntity<BigDecimal> multiply(@PathVariable String valuea, @PathVariable String valueb) {
        return new ResponseEntity<>(calculatorRestControllerSimpleService.multiply(valuea, valueb), HttpStatus.OK);
    }

    @PostMapping(value = "/divide/{valuea}/{valueb}" , produces = APPLICATION_JSON)
    public ResponseEntity<BigDecimal> divide(@PathVariable String valuea, @PathVariable String valueb) {
        return new ResponseEntity<>(calculatorRestControllerSimpleService.divide(valuea, valueb), HttpStatus.OK);
    }

    @ExceptionHandler(value = ExceptionCalculator.class)
    public ResponseEntity<Object> handleExceptionCalculator(ExceptionCalculator exceptionCalculator) {
        return new ResponseEntity<>("Calculator Operation Exception", HttpStatus.BAD_REQUEST);
    }
}