package com.mimacom.calculator.service;

import com.mimacom.calculator.model.OperationSimple;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorSimpleService {
    public BigDecimal add(OperationSimple model){
        return model.getValue1().add(model.getValue2());
    }

    public BigDecimal subtract(OperationSimple model){
        return model.getValue1().subtract(model.getValue2());
    }

    public BigDecimal multiply(OperationSimple model){
        return model.getValue1().multiply(model.getValue2());
    }

    public BigDecimal divide(OperationSimple model){
        if(model.getValue1().doubleValue() == 0) return BigDecimal.valueOf(0.00);
        if(model.getValue2().doubleValue() == 0) return BigDecimal.valueOf(0.00);
        return model.getValue1().divide(model.getValue2());
    }

    public OperationSimple clearSimple(OperationSimple model){
        model.setValue1(BigDecimal.valueOf(0.00));
        model.setValue2(BigDecimal.valueOf(0.00));
        return model;
    }
}

