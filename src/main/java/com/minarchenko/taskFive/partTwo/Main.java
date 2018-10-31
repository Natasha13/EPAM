package com.minarchenko.taskFive.partTwo;
import java.util.*;

public class Main {
    public static void main(String[] a) {
        List<Integer> elements = new ArrayList<>();

        int minimum = 5;
        int maxValue = 10;
        int numberOfValues=10;

        System.out.println("List values .....");
        Random rn = new Random();
        for (int i = 0; i <numberOfValues ; i++) {
            elements.add( minimum + rn.nextInt(maxValue - minimum + 1));
        }

        System.out.println(elements);

        Set<Integer> set = new HashSet<>(elements);
        System.out.println(set);

    }
}
