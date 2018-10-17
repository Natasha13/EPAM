package com.taskThree.partOne;

/**
 * Created by Nataliia on 13.10.2018.
 */
public abstract class Toy {

    private int price;
    private String age;
    private String name;

    public Toy(int price, String age, String name) {
        this.price = price;
        this.age = age;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  " price=" + price +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' ;
    }
}
