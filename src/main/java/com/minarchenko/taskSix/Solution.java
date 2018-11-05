package com.minarchenko.taskSix;

import com.minarchenko.taskSix.model.Shape;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String csvFileTriangle = "C:/NATA/Java/Courses/EPAM/EPAM/src/main/resources/triangle.csv";
        String csvFileRectangle= "C:/NATA/Java/Courses/EPAM/EPAM/src/main/resources/rectangle.csv";
        String csvFileCircle= "C:/NATA/Java/Courses/EPAM/EPAM/src/main/resources/circle.csv";

        List<Shape> shapes = DataSource.getShapes();
        System.out.print( ShapesView.shapeForPrinting(shapes));

        System.out.println();
        System.out.println("sum square of all figures = " + ShapeService.sumSquare(shapes));

        System.out.println();
        System.out.println("Choose : ");
        System.out.println("1) Triangle ");
        System.out.println("2) Rectangle: ");
        System.out.println("3) Circle: ");
        System.out.println("4) Enter file for data inserting: ");
        System.out.println("5) Exit ");

       List<Shape> shapeFigure = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int numMax = scan.nextInt();
        switch (numMax) {
            case 1:
                shapeFigure = com.minarchenko.taskSix.DataSource.getTriangles(csvFileTriangle);
                break;
            case 2:
                shapeFigure = com.minarchenko.taskSix.DataSource.getRectangles(csvFileRectangle);
                break;
            case 3:
                shapeFigure = com.minarchenko.taskSix.DataSource.getCircles(csvFileCircle);
                break;
            case 4:
                String fileToEnterNewData=scan.next();
                File file = new File(fileToEnterNewData);
                FileWriter newFile= new FileWriter(file,true);
                String enterLine=scan.next();
                newFile.append('\n');
                newFile.append(enterLine);
                newFile.close();
                break;
            default:
                System.out.println("Choose existing variant ");
                break;
        }
        scan.close();

        System.out.println("Figure Square = " +  ShapeService.sumSquare(shapeFigure));

        System.out.println();
        shapes.sort(Comparator.comparing(Shape::square));
        System.out.print( ShapesView.shapeForPrinting(shapes));

        System.out.println();
        shapes.sort(Comparator.comparing(Shape::getColor));
        System.out.print( ShapesView.shapeForPrinting(shapes));
    }
}
