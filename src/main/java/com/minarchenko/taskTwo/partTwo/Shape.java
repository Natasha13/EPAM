package com.minarchenko.taskTwo.partTwo;

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
                " color='" + color + '\'';
    }
    public String draw() {
        return this.toString() + "Square = " + this.square();
    }
}
