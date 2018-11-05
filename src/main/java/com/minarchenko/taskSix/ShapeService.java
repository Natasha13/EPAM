package com.minarchenko.taskSix;


import com.minarchenko.taskSix.model.Shape;

import java.util.List;

public class ShapeService {
    public static double sumSquare(List<Shape> shapes) {
        double resultSum=0;
        for (Shape shape : shapes) {
            resultSum = resultSum + shape.square();
        }
        return resultSum;
    }
}
