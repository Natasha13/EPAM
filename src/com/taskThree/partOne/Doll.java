package com.taskThree.partOne;

/**
 * Created by Nataliia on 13.10.2018.
 */
public class Doll  extends Toy {

    public int getSize() {
        return size;
    }

    public boolean isInteractive() {
        return interactive;
    }

    private int size;
    private boolean interactive;

    public Doll(int price, String age, String name, int size,boolean interactive) {
        super(price, age, name);
        this.size=size;
        this.interactive=interactive;
    }

    @Override
    public String toString() {
        return "Doll " +
                "size=" + size +
                ", interactive=" + interactive + super.toString();
    }
}
