package com.mimacom.calculator.service;

import com.mimacom.calculator.model.OperationSimple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorSimpleServiceTest {

    @Autowired
    private CalculatorSimpleService calculatorSimpleService;

    @Test
    void add() {
        Assertions.assertEquals(3, calculatorSimpleService.add(new OperationSimple(1,2)));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(1, calculatorSimpleService.subtract(new OperationSimple(2,1)));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(12, calculatorSimpleService.multiply(new OperationSimple(4,3)));
    }

    @Test
    void divide() {
        Assertions.assertEquals(1, calculatorSimpleService.divide(new OperationSimple(4,4)));
    }

    @Test
    void clearSimple() {
        Assertions.assertNotNull(calculatorSimpleService.clearSimple(new OperationSimple(0,0)));
    }
}