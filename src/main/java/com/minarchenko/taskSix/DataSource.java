package com.minarchenko.taskSix;

import com.minarchenko.taskSix.model.Circle;
import com.minarchenko.taskSix.model.Rectangle;
import com.minarchenko.taskSix.model.Shape;
import com.minarchenko.taskSix.model.Triangle;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private static Logger logger = Logger.getLogger(DataSource.class);

    public static List<Shape> getShapes() {
        logger.info("getShapes ");
        String csvFileTriangle = "C:/NATA/Java/Courses/EPAM/EPAM/src/main/resources/triangle.csv";
        String csvFileRectangle= "C:/NATA/Java/Courses/EPAM/EPAM/src/main/resources/rectangle.csv";
        String csvFileCircle= "C:/NATA/Java/Courses/EPAM/EPAM/src/main/resources/circle.csv";

        List<Shape> rectangles = getRectangles(csvFileRectangle);
        List<Shape> circles = getCircles(csvFileCircle);
        List<Shape> triangles = getTriangles(csvFileTriangle);
        int k=0;
        List<Shape> shapes = new ArrayList<>();
        shapes.addAll(triangles);
        shapes.addAll(circles);
        shapes.addAll(rectangles);

        return shapes;
    }

    public static List<Shape> getTriangles(String csvFileTriangle){
        BufferedReader br=null;
        String line="";
        String cvsSplitBy = ",";

        List<Shape> triangles=new ArrayList<>();
        try {
            br=new BufferedReader(new FileReader(csvFileTriangle));
            while ((line = br.readLine()) != null) {
                String[] triangleOne = line.split(cvsSplitBy);

                int a = Integer.parseInt(triangleOne[0]);
                int b = Integer.parseInt(triangleOne[1]);
                int c = Integer.parseInt(triangleOne[2]);
                String color = triangleOne[3];
                Triangle triangle = new Triangle( a, b, c, color);
                triangles.add(triangle);
            }
        } catch (IOException e) {
            logger.error("Error reading from file: " + csvFileTriangle, e);
        }
        return triangles;
    }

    public static List<Shape> getRectangles(String csvFileRectangle){
        BufferedReader br=null;
        String line="";
        String cvsSplitBy = ",";

        List<Shape> rectangles=new ArrayList<>();
        try {
            br=new BufferedReader(new FileReader(csvFileRectangle));
            while ((line = br.readLine()) != null) {
                String[] rectangleOne = line.split(cvsSplitBy);

                int a = Integer.parseInt(rectangleOne[0]);
                int b = Integer.parseInt(rectangleOne[1]);
                String color = rectangleOne[2];
                Rectangle rectangle = new Rectangle( a, b, color);
                rectangles.add(rectangle);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rectangles;
    }

    public static List<Shape> getCircles(String csvFileCircle){
        BufferedReader br=null;
        String line="";
        String cvsSplitBy = ",";

        List<Shape> cirles=new ArrayList<>();
        try {
            br=new BufferedReader(new FileReader(csvFileCircle));
            while ((line = br.readLine()) != null) {
                String[] circleOne = line.split(cvsSplitBy);

                int a = Integer.parseInt(circleOne[0]);
                String color = circleOne[1];
                Circle circle = new Circle( a,  color);
                cirles.add(circle);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cirles;
    }
}

