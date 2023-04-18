package com.mimacom.calculator.service;

import com.mimacom.calculator.model.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculatorSimpleService {
    public int add(Operation model){
        return model.getValue1() + model.getValue2();
    }

    public int subtract(Operation model){
        return model.getValue1() - model.getValue2();
    }

    public int multiply(Operation model){
        return model.getValue1() * model.getValue2();
    }

    public double divide(Operation model){
        if(model.getValue1() == 0) return 0;
        if(model.getValue2() == 0) return 0;
        return (double) model.getValue1() / model.getValue2();
    }

    public Operation clearSimple(Operation model){
        model.setValue1(0);
        model.setValue2(0);
        return model;
    }

    public Operation clearAdvanced(Operation model){
        model.setValue3(0);
        return model;
    }
}

