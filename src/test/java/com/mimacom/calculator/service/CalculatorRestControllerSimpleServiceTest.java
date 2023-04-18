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
        Assertions.assertEquals(3, calculatorRestControllerSimpleService.add("1","2"));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(1, calculatorRestControllerSimpleService.subtract("2","1"));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(12, calculatorRestControllerSimpleService.multiply("4","3"));
    }

    @Test
    void divide() {
        Assertions.assertEquals(1, calculatorRestControllerSimpleService.divide("4","4"));
    }
}