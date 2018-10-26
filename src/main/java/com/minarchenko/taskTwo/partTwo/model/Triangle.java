package com.minarchenko.taskTwo.partTwo.model;

import com.minarchenko.taskTwo.partTwo.model.Shape;

public class Triangle extends Shape {
    private int a, b, c;


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


    public int getC() {
        return c;
    }


    public Triangle(int a, int b, int c, String color) {
        super(color);
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalArgumentException("With parametrs a= "+a+" b= "+b+" c= "+c+" the shape can't be triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

   @Override public double square() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


//    @Override public String toString(){
//        String s="Triangle a="+a+" b= "+b+" c= "+c+ " color ="+getColor();
//        return s;    }
//
    @Override public String toString(){
        return super.toString() + ", a="+a+", b= "+b+", c= "+c;
    }
}
