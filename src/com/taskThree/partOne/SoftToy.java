package com.taskThree.partOne;

/**
 * Created by Nataliia on 13.10.2018.
 */
public class SoftToy extends Toy {

    private int size;
    private String material;

    public SoftToy(int price, String age, String name, int size, String material) {
        super(price, age, name);
        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "SoftToy " +
                "size=" + size +
                ", material='" + material + '\'' + super.toString();
    }
}
