package com.minarchenko.taskTwo.partTwo;

public class ShapeService {
    public static double sumSquare(Shape[] shapes) {
        double resultSum=0;
        for (Shape shape : shapes) {
            resultSum = resultSum + shape.square();
        }
        return resultSum;
    }
}
