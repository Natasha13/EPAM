package com.minarchenko.taskTwo.partTwo.model;

public class Circle extends Shape {
    private int a;

    public int getA() {
        return a;
    }

    public Circle(int a, String color) {
        super(color);
        this.a = a;
    }
    @Override public String toString(){
        return super.toString() + ", r="+a;
    }
    @Override public double square() {
        return Math.PI*a*a;
    }
}