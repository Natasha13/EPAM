package com.minarchenko.taskSix.model;

public class Circle extends Shape {
    private int a;

    public int getA() {
        return a;
    }

    public Circle(int radius, String color) {
        super(color);
        this.a = radius;
    }
    @Override public String toString(){
        return super.toString() + ", r="+a;
    }
    @Override public double square() {
        return Math.PI*a*a;
    }
}