package com.mimacom.calculator.controller;

import com.mimacom.calculator.service.CalculatorRestControllerSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorSimpleRestController {

    public static final String APPLICATION_JSON = "application/json";
    @Autowired
    private CalculatorRestControllerSimpleService calculatorRestControllerSimpleService;

    @PostMapping(value = "/add/{valuea}/{valueb}", produces = APPLICATION_JSON)
    public ResponseEntity<Integer> add(@PathVariable String valuea, @PathVariable String valueb) {
        return new ResponseEntity<>(calculatorRestControllerSimpleService.add(valuea, valueb), HttpStatus.OK);
    }

    @PostMapping(value = "/subtract/{valuea}/{valueb}" , produces = APPLICATION_JSON)
    public ResponseEntity<Integer> subtract(@PathVariable String valuea, @PathVariable String valueb) {
        return new ResponseEntity<>(calculatorRestControllerSimpleService.subtract(valuea, valueb), HttpStatus.OK);
    }

    @PostMapping(value = "/multiply/{valuea}/{valueb}" , produces = APPLICATION_JSON)
    public ResponseEntity<Integer> multiply(@PathVariable String valuea, @PathVariable String valueb) {
        return new ResponseEntity<>(calculatorRestControllerSimpleService.multiply(valuea, valueb), HttpStatus.OK);
    }

    @PostMapping(value = "/divide/{valuea}/{valueb}" , produces = APPLICATION_JSON)
    public ResponseEntity<Double> divide(@PathVariable String valuea, @PathVariable String valueb) {
        return new ResponseEntity<>(calculatorRestControllerSimpleService.divide(valuea, valueb), HttpStatus.OK);
    }
}