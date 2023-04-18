package com.mimacom.calculator.model;

public class OperationSimple {

    private String operations;
    private int value1;
    private int value2;
    private int value3;

    public OperationSimple() {
    }

    public OperationSimple(int value3) {
        this.value3 = value3;
    }

    public OperationSimple(String operation) {
        this.operations = operation;
    }

    public OperationSimple(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }
}
