package com.minarchenko.taskEightPartThree;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Runner {
    // Collections.synchronizedMap(new HashMap<>());
    Map<Integer, Integer> map = new ConcurrentHashMap<>();

    public void run() {
        final int COUNT = 1000;
        Thread[] threadWrite = new Thread[COUNT];
        Thread[] threadRead = new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            int j = i;
            threadWrite[i] = new Thread(() -> {
                map.put(j, j);
            });
            threadRead[i] = new Thread(() -> {
                System.out.println(map.get(j));
            });
        }
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            threadWrite[i].start();
            threadRead[i].start();
        }
        for (int i = 0; i < COUNT; i++) {
            try {
                threadWrite[i].join();
                threadRead[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end = System.nanoTime();
        System.out.println("\n Time = " + (end - start) / 1000000000.0);
    }
}
//package com.minarchenko.taskEightPartThree;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//public class Runner {
//    Map<Integer, Integer> map = new HashMap<>();
//
//
//    public void testHashmap() {
//        final int COUNT = 1000;
//        map = new ConcurrentHashMap<>();
//        Thread[] threadWrite = new Thread[COUNT];
//        Thread[] threadRead = new Thread[COUNT];
//        for (int i = 0; i < COUNT; i++) {
//            int j = i;
//            threadWrite[i] = new Thread(() -> {
//                synchronized (this.map) {
//                    map.put(j, j);
//                }
//            });
//            threadRead[i] = new Thread(() -> {
//                synchronized (this.map) {
//                    System.out.println(map.get(j));
//                }
//            });
//        }
//        long start = System.nanoTime();
//        for (int i = 0; i < COUNT; i++) {
//            threadWrite[i].start();
//            threadRead[i].start();
//        }
//        for (int i = 0; i < COUNT; i++) {
//            try {
//                threadWrite[i].join();
//                threadRead[i].join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        long end = System.nanoTime();
//        System.out.println("\n Time = " + (end - start) / 1000000000.0);
//    }
//}