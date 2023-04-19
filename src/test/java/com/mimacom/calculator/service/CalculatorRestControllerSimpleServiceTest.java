package com.mimacom.calculator.service;

import com.mimacom.calculator.model.OperationSimple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorRestControllerSimpleServiceTest {

    @Autowired
    private CalculatorRestControllerSimpleService calculatorRestControllerSimpleService;

    @Test
    void add() {
        Assertions.assertNotNull(calculatorRestControllerSimpleService.add("1", "2"));
    }

    @Test
    void subtract() {
        Assertions.assertNotNull(calculatorRestControllerSimpleService.subtract("2", "1"));
    }

    @Test
    void multiply() {
        Assertions.assertNotNull(calculatorRestControllerSimpleService.multiply("4.454", "3.343"));
    }

    @Test
    void divide() {
        Assertions.assertNotNull(calculatorRestControllerSimpleService.divide("4", "4"));
    }
}