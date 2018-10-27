package com.minarchenko.taskTwo.partTwo;

import com.minarchenko.taskTwo.partTwo.model.Circle;
import com.minarchenko.taskTwo.partTwo.model.Rectangle;
import com.minarchenko.taskTwo.partTwo.model.Shape;
import com.minarchenko.taskTwo.partTwo.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nataliia on 27.10.2018.
 */
public class ShapesViewTest {
    @Test
    public void testShapeForPrinting() throws Exception {

        Circle circle=new Circle(12,"pink");//452.4
        Rectangle rectangle=new Rectangle(15,18,"grey");//270
        Triangle triangle=new Triangle(5,8,11,"yellow");//18.330

        Shape[] shapes=new Shape[]{circle,rectangle,triangle};
        String shapeStringResulting="Circle color=pink, r=12 Square = 452,389 \n"+
                "Rectangle color=grey, a=15, b= 18 Square = 270,000 \n"+
                "Triangle color=yellow, a=5, b= 8, c= 11 Square = 18,330 \n" ;

        Assert.assertEquals(shapeStringResulting,ShapesView.shapeForPrinting(shapes));
    }
}