package com.minarchenko.taskTwo.partTwo.model;

public class Rectangle extends Shape {
    private int a, b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Rectangle(int a, int b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }
//    @Override public String toString(){
//        String s="Rectangle a="+a+" b= "+b+" color ="+getColor();
//        return s;
//    }
    @Override public String toString(){
        return super.toString() + ", a="+a+", b= "+b;
    }

    @Override public double square() {

        return (double) (a* b);
    }
}
