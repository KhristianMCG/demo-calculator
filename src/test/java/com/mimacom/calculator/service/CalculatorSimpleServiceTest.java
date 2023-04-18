package com.mimacom.calculator.service;

import com.mimacom.calculator.model.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorSimpleServiceTest {

    @Autowired
    private CalculatorSimpleService calculatorSimpleService;

    @Test
    void add() {
        Assertions.assertEquals(3, calculatorSimpleService.add(new Operation(1,2)));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(1, calculatorSimpleService.subtract(new Operation(2,1)));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(12, calculatorSimpleService.multiply(new Operation(4,3)));
    }

    @Test
    void divide() {
        Assertions.assertEquals(1, calculatorSimpleService.divide(new Operation(4,4)));
    }

    @Test
    void clearSimple() {
        Assertions.assertNotNull(calculatorSimpleService.clearSimple(new Operation(0,0)));
    }
}