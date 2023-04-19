package com.mimacom.calculator.model;

import java.math.BigDecimal;

public class OperationSimple {

    private String operations;
    private BigDecimal value1;
    private BigDecimal value2;
    private BigDecimal value3;

    public OperationSimple() {
    }

    public OperationSimple(BigDecimal value3) {
        this.value3 = value3;
    }

    public OperationSimple(String operation) {
        this.operations = operation;
    }

    public OperationSimple(BigDecimal value1, BigDecimal value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    public BigDecimal getValue1() {
        return value1;
    }

    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    public BigDecimal getValue2() {
        return value2;
    }

    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }

    public BigDecimal getValue3() {
        return value3;
    }

    public void setValue3(BigDecimal value3) {
        this.value3 = value3;
    }
}
