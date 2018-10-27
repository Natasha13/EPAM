package com.minarchenko.taskTwo.partTwo;

import com.minarchenko.taskTwo.partTwo.model.Circle;
import com.minarchenko.taskTwo.partTwo.model.Rectangle;
import com.minarchenko.taskTwo.partTwo.model.Shape;
import com.minarchenko.taskTwo.partTwo.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class ShapeServiceTest {
    @Test
    public void testSumSquare() throws Exception {
        Circle circle=new Circle(5,"green");
        Rectangle rectangle=new Rectangle(2,3,"green");
        Triangle triangle=new Triangle(5,6,7,"green");

        Shape[] shapes=new Shape[]{circle,rectangle,triangle};

        Assert.assertEquals(ShapeService.sumSquare(shapes),99.24,0.09);
  }

}