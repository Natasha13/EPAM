package com.minarchenko.taskTwo.partTwo.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nataliia on 26.10.2018.
 */
public class RectangleTest {
    @Test
    public void testSquare() throws Exception {
        Rectangle rectangle=new Rectangle(5,6,"green");
        double resultSquareToCompare =rectangle.square();
        Assert.assertEquals(resultSquareToCompare,30,0.09);
    }

    @Test
    public void testDrawRectangle() throws Exception {
        Rectangle rectangle=new Rectangle(5,6,"green");
        String draw = rectangle.draw();
        Assert.assertEquals("Rectangle color=green, a=5, b= 6 Square = 30,000 RectangleTest\n",draw);
    }
}