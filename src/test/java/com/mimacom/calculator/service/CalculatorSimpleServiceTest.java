package com.mimacom.calculator.service;

import com.mimacom.calculator.exception.ExceptionCalculator;
import com.mimacom.calculator.model.OperationSimple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class CalculatorSimpleServiceTest {

    @Autowired
    private CalculatorSimpleService calculatorSimpleService;

    @Test
    void add() {
        Assertions.assertNotNull(calculatorSimpleService.add(new OperationSimple(new BigDecimal("1.5"),new BigDecimal("2.6677"))));
    }

    @Test
    void subtract() {
        Assertions.assertNotNull(calculatorSimpleService.subtract(new OperationSimple(new BigDecimal("2.67"), new BigDecimal("1.56"))));
    }

    @Test
    void multiply() {
        Assertions.assertNotNull(calculatorSimpleService.multiply(new OperationSimple(new BigDecimal("4"),new BigDecimal("3"))));
    }

    @Test
    void divide() {
        Assertions.assertNotNull(calculatorSimpleService.divide(new OperationSimple(new BigDecimal("4"),new BigDecimal("4"))));
    }

    @Test
    void clearSimple() {
        Assertions.assertNotNull(calculatorSimpleService.clearSimple(new OperationSimple(new BigDecimal("0"), new BigDecimal("0"))));
    }

    @Test
    void testErrorHandling() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            calculatorSimpleService.divide(new OperationSimple(new BigDecimal("FFF"),new BigDecimal("4")));
        });
    }
}