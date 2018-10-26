package com.minarchenko.taskTwo.partTwo;

import com.minarchenko.taskTwo.partTwo.model.Shape;

public class ShapesView {
    public static String shapeForPrinting(Shape[] shapes){
        String shapeStringResulting="";
        for (Shape shape : shapes) {
            shapeStringResulting=shapeStringResulting+shape.draw();
        }
        return shapeStringResulting;
    }
}
