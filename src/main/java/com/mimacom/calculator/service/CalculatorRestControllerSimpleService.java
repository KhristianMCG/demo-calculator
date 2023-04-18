package com.mimacom.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorRestControllerSimpleService {
    public Integer add(final String valuea, final String valueb){
        return Integer.parseInt(valuea) + Integer.parseInt(valueb);
    }

    public Integer subtract(final String valuea, final String valueb){
        return Integer.parseInt(valuea) - Integer.parseInt(valueb);
    }

    public Integer multiply(final String valuea, final String valueb){
        return Integer.parseInt(valuea) * Integer.parseInt(valueb);
    }

    public Double divide(final String valuea, final String valueb){
        int valueaint = Integer.parseInt(valuea);
        int valuebint = Integer.parseInt(valueb);
        if(valueaint == 0) return 0.0;
        if(valuebint == 0) return 0.0;
        return (double) valueaint / valuebint;
    }
}

