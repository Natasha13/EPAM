package com.minarchenko.taskEightParFive;

import java.io.File;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Runner {
    public void run() {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        commonPool.execute(new FilePass(new File("C:/NATA/")));
        commonPool.awaitQuiescence(1, TimeUnit.MINUTES);
    }
}
