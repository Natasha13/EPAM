package com.minarchenko.taskTwo.partTwo;

import com.minarchenko.taskTwo.partTwo.model.Circle;
import com.minarchenko.taskTwo.partTwo.model.Rectangle;
import com.minarchenko.taskTwo.partTwo.model.Shape;
import com.minarchenko.taskTwo.partTwo.model.Triangle;

public class DataSource {

    public static Shape[] getShapes() {
        Rectangle[] rectangles = getRectangles();
        Circle[] circles = getCircles();
        Triangle[] triangles = getTriangles();
        int k=0;
        Shape[] shapes = new Shape[rectangles.length + circles.length + triangles.length];
        for (Triangle triangle: triangles) {
            shapes[k]=triangle;
            k++;
        }
        for (Circle circle: circles) {
            shapes[k]=circle;
            k++;
        }
        for (Rectangle rectangle: rectangles) {
            shapes[k]=rectangle;
            k++;
        }
        return shapes;
    }

    public static Triangle[] getTriangles() {
        return new Triangle[]{
                new Triangle(4, 2, 3,"green"),
                new Triangle(5, 8, 11,"yellow"),
                new Triangle(12, 15, 18,"red"),
                new Triangle(11, 15, 24,"white")
        };
    }

    public static Circle[] getCircles() {
        return new Circle[]{
                new Circle(1,"green"),
                new Circle(5,"grey"),
                new Circle(12,"pink")
        };
    }
    public static Rectangle[] getRectangles() {
        return new Rectangle[]{
                new Rectangle(1, 2,"green"),
                new Rectangle(5, 8,"orange"),
                new Rectangle( 15, 18,"grey")
        };
    }
}

