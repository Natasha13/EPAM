package com.minarchenko.taskEightPartTwo;

public class Runner {
    public static int value = 0;
    public static boolean flag = false;

    public void run() {
        new Thread(() -> {
            synchronized (this) {
                for (int i = 0; i < 1000; i++) {
                    while (Runner.flag) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                flag=false;
                Runner.value++;

            }
        }).start();

        new Thread(() -> {
            synchronized (this) {
                for (int i = 0; i < 1000; i++) {
                    while (!Runner.flag) {
                        try {
                            wait();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                    System.out.println(Runner.value);
                    flag = false;
                    notify();
                }
            }
        }).start();
    }

}
