package com.minarchenko.taskSeven;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {

        try {
            new Runner().run();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
