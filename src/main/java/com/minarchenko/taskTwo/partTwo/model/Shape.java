package com.minarchenko.taskTwo.partTwo.model;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract public double square();

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() +
                " color=" + color ;
    }

    public String draw() {
        return this.toString() +String.format(" Square = %1$.3f \n", this.square());
    }
}
