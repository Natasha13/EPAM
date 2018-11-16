package com.minarchenko.taskSeven;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Runner {
    public void run() throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {

        Object bla = new UnaruOperation();

        Class<?> clazz = bla.getClass();
        Constructor<?> constructor=clazz.getConstructor(Double.class);
        Object obj=constructor.newInstance(70d);

        System.out.println(obj);

        Method[] methods=clazz.getMethods();
        for (Method method:methods) {
            if (method.getName().startsWith("set")){
                method.invoke(obj,0.0);
                System.out.println(method.getName()+" "+obj);
            }else if(method.getName().startsWith("inc")){
                method.invoke(obj);
                System.out.println(method.getName()+" "+obj);
            }
        }
    }
}
