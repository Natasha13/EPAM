package com.taskTwo.partTwo ;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Shape[] shapes=DataSource.getShapes();
        for (Shape shape:shapes){
                  System.out.println(shape);
            System.out.printf(" Square = %1$.3f \n", shape.square());
        }
        Shape[] shapes1 = Arrays.copyOf(shapes, shapes.length);
        Arrays.sort(shapes, Comparator.comparing(Shape::square));
        for (Shape shape : shapes) {
            System.out.printf("Shape: "+ shape+" Square = %1$.3f \n", shape.square());
        }
//        Triangle[] triangles=DataSource.getTriangles();
//        Circle[] circles= DataSource.getCircles();
//        Rectangle[] rectangles=DataSource.getRectangles();
//        for (Triangle triangle : triangles) {
//            System.out.println("Triangle a="+ triangle.getA());
//            System.out.println("Triangle Square = "+ triangle.triagleSquare());
//            System.out.println("Triangle color = "+ triangle.getColor());
//        }
//
//        System.out.println();
//
//        for (Circle circle : circles) {
//            System.out.println("Circle r="+ circle.getA());
//        }
//
//        System.out.println();
//
//        for (Rectangle rectangle : rectangles) {
//            System.out.println("Rectangle a="+ rectangle.getA());
//        }
    }
}
