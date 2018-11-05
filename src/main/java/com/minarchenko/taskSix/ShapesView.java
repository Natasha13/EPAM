package com.minarchenko.taskSix;


import com.minarchenko.taskSix.model.Shape;

import java.util.List;

public class ShapesView {
    public static String shapeForPrinting(List<Shape> shapes){
        String shapeStringResulting="";
        for (Shape shape : shapes) {
            shapeStringResulting=shapeStringResulting+shape.draw();
        }
        return shapeStringResulting;
    }
}
