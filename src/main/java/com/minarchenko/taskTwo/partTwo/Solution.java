package com.minarchenko.taskTwo.partTwo;

import com.minarchenko.taskTwo.partTwo.model.Shape;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Shape[] shapes = DataSource.getShapes();
        System.out.print( ShapesView.shapeForPrinting(shapes));

        System.out.println();
        System.out.println("sum square of all figures = " + ShapeService.sumSquare(shapes));

        System.out.println();
        System.out.println("Choose : ");
        System.out.println("1) Triangle ");
        System.out.println("2) Rectangle: ");
        System.out.println("3) Circle: ");
        System.out.println("4) Exit ");

        Shape[] shapeFigure = new Shape[shapes.length];

        Scanner scan = new Scanner(System.in);
        int numMax = scan.nextInt();
        switch (numMax) {
            case 1:
                shapeFigure = DataSource.getTriangles();
                break;
            case 2:
                shapeFigure = DataSource.getRectangles();
                break;
            case 3:
                shapeFigure = DataSource.getCircles();
                break;
            default:
                System.out.println("Choose existing variant ");
                break;
        }
        scan.close();

        System.out.println("Figure Square = " +  ShapeService.sumSquare(shapeFigure));

        System.out.println();
        Arrays.sort(shapes, Comparator.comparing(Shape::square));
        System.out.print( ShapesView.shapeForPrinting(shapes));

        System.out.println();

        Arrays.sort(shapes, Comparator.comparing(Shape::getColor));
        System.out.print( ShapesView.shapeForPrinting(shapes));
    }
}
