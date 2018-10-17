package com.taskThree.partOne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Nataliia on 13.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        int priceOfAllToys = 0;
        Toy[] toys = DataSource.getToys();
        for (Toy toy : toys) {
            System.out.println(toy);
        }

        System.out.println();

        Arrays.sort(toys, Comparator.comparing(Toy::getName));
        for (Toy toy : toys) {
            System.out.println(toy);
        }

        for (Toy toy : toys) {
            priceOfAllToys = priceOfAllToys + toy.getPrice();
        }

        System.out.println("priceOfAllToys = " + priceOfAllToys);

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Choose highest price: ");
        int numMax = scan.nextInt();
        System.out.println("Choose highest age: ");
        int numMax2 = scan.nextInt();
        System.out.println("Choose name: ");
        scan.nextLine();
        String numMax3 = scan.nextLine();
        for (Toy toy : toys) {
            if (Objects.equals(toy.getName(), numMax3)) {
                if (toy.getPrice() <= numMax) {
                    if (Integer.parseInt(toy.getAge().substring(toy.getAge().indexOf('-') + 1, toy.getAge().length() - 6)) < numMax2) {
                        System.out.println(toy);
                    }
                }
            }
        }

    }
}


