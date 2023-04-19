package com.mimacom.calculator.service;

import com.mimacom.calculator.exception.ExceptionCalculator;
import com.mimacom.calculator.model.OperationSimple;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorSimpleService {
    public BigDecimal add(OperationSimple model){
        BigDecimal result;
        try {
            result = model.getValue1().add(model.getValue2());
        } catch (Exception e) {
            throw new ExceptionCalculator(e.getMessage());
        }
        return result;
    }

    public BigDecimal subtract(OperationSimple model){
        BigDecimal result;
        try {
            result = model.getValue1().subtract(model.getValue2());
        } catch (Exception e) {
            throw new ExceptionCalculator(e.getMessage());
        }
        return result;
    }

    public BigDecimal multiply(OperationSimple model){
        BigDecimal result;
        try {
            result = model.getValue1().multiply(model.getValue2());
        } catch (Exception e) {
            throw new ExceptionCalculator(e.getMessage());
        }
        return result;
    }

    public BigDecimal divide(OperationSimple model){
        BigDecimal valueaDecimal;
        BigDecimal valuebDecimal;
        BigDecimal result;
        try {
            valueaDecimal = model.getValue1();
            valuebDecimal = model.getValue2();
            if (valueaDecimal.compareTo(BigDecimal.valueOf(0)) > 0) return BigDecimal.valueOf(0);
            if (valuebDecimal.compareTo(BigDecimal.valueOf(0)) > 0) return BigDecimal.valueOf(0);
            result = valueaDecimal.divide(valuebDecimal);
        } catch (Exception e) {
            throw new ExceptionCalculator(e.getMessage());
        }
        return result;
    }

    public OperationSimple clearSimple(OperationSimple model){
        model.setValue1(BigDecimal.valueOf(0.00));
        model.setValue2(BigDecimal.valueOf(0.00));
        return model;
    }
}

