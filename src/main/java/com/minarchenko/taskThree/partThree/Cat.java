package com.minarchenko.taskThree.partThree;

public class Cat {
    public static Cat Busya= new Cat("Busya");
    public static Cat Kitty= new Cat("Kitty");
    public static Cat Peppi= new Cat("Peppi");

    private String name;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat[] values(){
        return new Cat[] {Busya,Kitty,Peppi};
    }

    public String getName() {
        return name;
    }

    public int ordinal() {
        int numberInCats=0;
        for (Cat cat : Cat.values()) {
            if (this==cat){
                return numberInCats;
            }
            numberInCats++;
        }
        return numberInCats;
    }
}
