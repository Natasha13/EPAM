package com.minarchenko.taskSeven;

public class UnaruOperation {
    private double value;

    public UnaruOperation() {
        value = 100.0;
    }

    public UnaruOperation(Double value) {
        this.value = value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void unsigned() {
        value = -value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UnaruOperation{" +
                "value=" + value +
                '}';
    }
}
