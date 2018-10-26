package com.minarchenko.taskThree.partOne;

/**
 * Created by Nataliia on 13.10.2018.
 */
public class Constructor extends Toy {

    private int numberOfParts;
    private String material;

    public Constructor(int price, String age, String name, int numberOfParts, String material) {
        super(price, age, name);
        this.numberOfParts = numberOfParts;
        this.material = material;
    }

    public int getNumberOfParts() {
        return numberOfParts;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Constructor " +
                "numberOfParts=" + numberOfParts +
                ", material='" + material + '\'' + super.toString();
    }
}
