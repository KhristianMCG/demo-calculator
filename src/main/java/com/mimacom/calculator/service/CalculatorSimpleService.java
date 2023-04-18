package com.mimacom.calculator.service;

import com.mimacom.calculator.model.OperationSimple;
import org.springframework.stereotype.Service;

@Service
public class CalculatorSimpleService {
    public int add(OperationSimple model){
        return model.getValue1() + model.getValue2();
    }

    public int subtract(OperationSimple model){
        return model.getValue1() - model.getValue2();
    }

    public int multiply(OperationSimple model){
        return model.getValue1() * model.getValue2();
    }

    public double divide(OperationSimple model){
        if(model.getValue1() == 0) return 0;
        if(model.getValue2() == 0) return 0;
        return (double) model.getValue1() / model.getValue2();
    }

    public OperationSimple clearSimple(OperationSimple model){
        model.setValue1(0);
        model.setValue2(0);
        return model;
    }
}

