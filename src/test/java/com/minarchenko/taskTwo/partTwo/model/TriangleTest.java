package com.minarchenko.taskTwo.partTwo.model;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testSquare() throws Exception {
        Triangle triangle=new Triangle(5,6,7,"green");
        double a =triangle.square();
        Assert.assertEquals(a,14.7,0.09);
    }

    @Test
    public void testDrawTriangle() throws Exception {
        Triangle triangle=new Triangle(5,6,7,"green");
        String draw = triangle.draw();
        Assert.assertEquals("Triangle color=green, a=5, b= 6, c= 7 Square = 14,697 \n",draw);
    }
}