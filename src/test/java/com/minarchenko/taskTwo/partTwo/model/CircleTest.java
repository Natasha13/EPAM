package com.minarchenko.taskTwo.partTwo.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nataliia on 26.10.2018.
 */
public class CircleTest {
    @Test
    public void testSquare() throws Exception {
        Circle circle=new Circle(5,"green");
        double a =circle.square();
        Assert.assertEquals(a,78.54,0.09);
    }

    @Test
    public void testDrawCircle() throws Exception {
        Circle circle=new Circle(5,"green");

        String draw = circle.draw();
        Assert.assertEquals("Circle color=green, r=5 Square = 78,540",draw);
    }
}