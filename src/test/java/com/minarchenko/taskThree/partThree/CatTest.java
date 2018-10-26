package com.minarchenko.taskThree.partThree;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testEnumObjectNames() {

        if (!Objects.equals(Cat.Peppi.getName(), "Peppi")){
            throw new AssertionError("Name of cat not equal to 'Peppi'");
        }
    }

    @Test
    public void testEnumValues(){
        Cat[] arrayToCompareWithEnum={Cat.Busya,Cat.Kitty,Cat.Peppi};
       Cat[] cats=Cat.values();
            if (!Arrays.deepEquals(cats,arrayToCompareWithEnum)){
                throw new AssertionError(".values() didn't match ");
        }
    }
}