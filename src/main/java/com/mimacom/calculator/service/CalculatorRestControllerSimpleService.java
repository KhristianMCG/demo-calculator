package com.mimacom.calculator.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorRestControllerSimpleService {
    public BigDecimal add(final String valuea, final String valueb){
        return new BigDecimal(Integer.parseInt(valuea) + Integer.parseInt(valueb));
    }

    public BigDecimal subtract(final String valuea, final String valueb){
        return new BigDecimal( Integer.parseInt(valuea) - Integer.parseInt(valueb));
    }

    public BigDecimal multiply(final String valuea, final String valueb){
        return new BigDecimal(Integer.parseInt(valuea) * Integer.parseInt(valueb));
    }

    public BigDecimal divide(final String valuea, final String valueb){
        final BigDecimal valueaDecimal = new BigDecimal(valuea);
        final BigDecimal valuebDecimal = new BigDecimal(valueb);
        if(valueaDecimal.compareTo(BigDecimal.valueOf(valuea))) return BigDecimal.valueOf(0.00);
        if(valuebDecimal.compareTo(BigDecimal.valueOf(0.00))) return BigDecimal.valueOf(0.00);
        return BigDecimal.valueOf(valueaDecimal.doubleValue() / valuebDecimal.doubleValue());
    }
}

