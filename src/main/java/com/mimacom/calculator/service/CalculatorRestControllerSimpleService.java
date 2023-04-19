package com.mimacom.calculator.service;

import com.mimacom.calculator.exception.ExceptionCalculator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorRestControllerSimpleService {
    public BigDecimal add(final String valuea, final String valueb) {
        BigDecimal result;
        try {
            result = new BigDecimal(valuea).add(new BigDecimal(valueb));
        } catch (Exception e) {
            throw new ExceptionCalculator(e.getMessage());
        }
        return result;
    }

    public BigDecimal subtract(final String valuea, final String valueb) {
        BigDecimal result;
        try {
            result = new BigDecimal(valuea).subtract(new BigDecimal(valueb));
        } catch (Exception e) {
            throw new ExceptionCalculator(e.getMessage());
        }
        return result;
    }

    public BigDecimal multiply(final String valuea, final String valueb) {
        BigDecimal result;
        try {
            result = new BigDecimal(valuea).multiply(new BigDecimal(valueb));
        } catch (Exception e) {
            throw new ExceptionCalculator(e.getMessage());
        }
        return result;
    }

    public BigDecimal divide(final String valuea, final String valueb) {
        BigDecimal valueaDecimal;
        BigDecimal valuebDecimal;
        BigDecimal result;
        try {
            valueaDecimal = new BigDecimal(valuea);
            valuebDecimal = new BigDecimal(valueb);
            if (valueaDecimal.compareTo(BigDecimal.valueOf(0)) > 0) return BigDecimal.valueOf(0);
            if (valuebDecimal.compareTo(BigDecimal.valueOf(0)) > 0) return BigDecimal.valueOf(0);
            result = valueaDecimal.divide(valuebDecimal);
        } catch (Exception e) {
            throw new ExceptionCalculator(e.getMessage());
        }
        return result;
    }
}

