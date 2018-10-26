package com.minarchenko.taskTwo.partTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Shape[] shapes = DataSource.getShapes();
        for (Shape shape : shapes) {
            System.out.print(shape);
            System.out.printf(" Square = %1$.3f \n", shape.square());
        }
        double sumSquare = 0;
        System.out.println();

        for (Shape shape : shapes) {
            sumSquare = sumSquare + shape.square();
        }
        System.out.println("sum square of all figures = " + sumSquare);

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Choose : ");
        System.out.println("1) Triangle ");
        System.out.println("2) Rectangle: ");
        System.out.println("3) Circle: ");
        System.out.println("4) Exit ");
        sumSquare = 0;
        Shape[] shapeFigure = new Shape[shapes.length];

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

        for (Shape shape : shapeFigure) {
            sumSquare = sumSquare + shape.square();
        }
        System.out.println("Figure Square = " + sumSquare);
        scan.close();

        System.out.println();
        Arrays.sort(shapes, Comparator.comparing(Shape::square));
        for (Shape shape : shapes) {
            System.out.printf("Shape: " + shape + " Square = %1$.3f \n", shape.square());
        }

        System.out.println();

        Arrays.sort(shapes, Comparator.comparing(Shape::getColor));
        for (Shape shape : shapes) {
            System.out.printf("Shape: " + shape + " Square = %1$.3f \n", shape.square());
        }

    }
}
