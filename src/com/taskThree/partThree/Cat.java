package com.taskThree.partThree;

public class Cat {
    public static Cat Busya= new Cat("Busya");
    public static Cat Kitty= new Cat("Kitty");
    public static Cat Peppi= new Cat("Peppi");

    private String name;

    private Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
