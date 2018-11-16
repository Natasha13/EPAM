package com.minarchenko.taskEightPartFour;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Runner {
    public void run() {
        int[] masInt = new int[100];
        for (int i = 0; i < masInt.length; i++) {
            Random randomGenerator = new Random();
//            int random = randomGenerator.nextInt(100);
//            masInt[i] = random;
            masInt[i] =1;
        }

        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        Long objResult = commonPool.invoke(new ArraySumTask(masInt,0,masInt.length-1));
        System.out.println("objResult = " + objResult);
    }
}
