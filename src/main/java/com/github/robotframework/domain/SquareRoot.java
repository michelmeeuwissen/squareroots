package com.github.robotframework.domain;

public class SquareRoot {

    private final double inputValue;

    private final double outputValue;

    public SquareRoot(double inputValue, double outputValue) {
        this.inputValue = inputValue;
        this.outputValue = outputValue;
    }

    public double getInputValue() {
        return inputValue;
    }

    public double getOutputValue() {
        return outputValue;
    }
}
