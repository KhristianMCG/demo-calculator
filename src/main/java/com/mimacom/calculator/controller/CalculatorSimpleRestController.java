package com.mimacom.calculator.controller;

import com.mimacom.calculator.exception.ExceptionCalculator;
import com.mimacom.calculator.service.CalculatorRestControllerSimpleService;
import io.corp.calculator.TracerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/calculator")
public class CalculatorSimpleRestController {

    private static final String APPLICATION_JSON = "application/json";
    private final TracerImpl tracer = new TracerImpl();
    @Autowired
    private CalculatorRestControllerSimpleService calculatorRestControllerSimpleService;

    @PostMapping(value = "/add/{valuea}/{valueb}", produces = APPLICATION_JSON)
    public ResponseEntity<BigDecimal> add(@PathVariable String valuea, @PathVariable String valueb) {
        final BigDecimal result = calculatorRestControllerSimpleService.add(valuea, valueb);
        tracer.trace(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(value = "/subtract/{valuea}/{valueb}", produces = APPLICATION_JSON)
    public ResponseEntity<BigDecimal> subtract(@PathVariable String valuea, @PathVariable String valueb) {
        final BigDecimal result = calculatorRestControllerSimpleService.subtract(valuea, valueb);
        tracer.trace(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(value = "/multiply/{valuea}/{valueb}", produces = APPLICATION_JSON)
    public ResponseEntity<BigDecimal> multiply(@PathVariable String valuea, @PathVariable String valueb) {
        final BigDecimal result = calculatorRestControllerSimpleService.multiply(valuea, valueb);
        tracer.trace(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(value = "/divide/{valuea}/{valueb}", produces = APPLICATION_JSON)
    public ResponseEntity<BigDecimal> divide(@PathVariable String valuea, @PathVariable String valueb) {
        final BigDecimal result = calculatorRestControllerSimpleService.divide(valuea, valueb);
        tracer.trace(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ExceptionHandler(value = ExceptionCalculator.class)
    public ResponseEntity<Object> handleExceptionCalculator(ExceptionCalculator exceptionCalculator) {
        return new ResponseEntity<>(exceptionCalculator.getMessage(), HttpStatus.BAD_REQUEST);
    }
}