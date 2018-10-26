package com.minarchenko.taskTwo.partTwo;

public class ShapesView {
    public static String shapeForPrinting(Shape[] shapes){
        String shapeStringResulting="";
        for (Shape shape : shapes) {
            shapeStringResulting=shapeStringResulting+shape.toString()
                    +String.format(" Square = %1$.3f \n", shape.square());
        }
        return shapeStringResulting;
    }
}
