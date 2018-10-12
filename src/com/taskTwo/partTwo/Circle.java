package com.taskTwo.partTwo;

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
        String s="Circle r="+a+" color ="+getColor();
        return s;
    }
    @Override public double square() {
        return Math.PI*a*a;
    }
}