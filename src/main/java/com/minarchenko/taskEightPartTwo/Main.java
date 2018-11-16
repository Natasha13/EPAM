package com.minarchenko.taskEightPartTwo;

//import java.util.concurrent.CyclicBarrier;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class Main {
//    public static void main(String[] args) {
//        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
//
//        AtomicInteger i = new AtomicInteger(0);
//        Runnable counter = () -> {
//            while (i.incrementAndGet() < 1000000) {
//                try {
//                    cyclicBarrier.await();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        Runnable printer = () -> {
//            while (i.get() < 1000000) {
//                System.out.println(i.get());
//                try {
//                    cyclicBarrier.await();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        Thread threadCounter = new Thread(counter);
//        threadCounter.start();
//        Thread threadPrinter = new Thread(printer);
//        threadPrinter.start();
//
//
//        System.out.println("End of main");
//   } }



public class Main{
    public static void main(String[] args) {
        new Runner().run();

    }
}
