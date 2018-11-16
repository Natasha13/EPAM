package com.minarchenko.taskSevenPartThree;

@FunctionalInterface
public interface ConvertString {
    String convert(String str);

    default boolean isNull(String string){
            return string==null||string.trim().equals("");
    }

}
