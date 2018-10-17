package com.taskThree.partTwo;

import java.util.Scanner;

/**
 * Created by Nataliia on 15.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        BikeShop bikeShop = new BikeShop();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of the shop");
        String shopName = scan.nextLine();
        bikeShop.setName(shopName);

        while (true) {
            System.out.println("Choose name of department(Bikes, Clothes, Bike Accessories): ");
            String departmentName = scan.nextLine();
            System.out.println("Choose type of goods(Mountain Bike, Road Bike, Kids Bike): ");
            String typeOfGoods = scan.nextLine();
            System.out.println("Choose service(rent/buy): ");
            String service = scan.nextLine();
            System.out.println("Choose location: ");
            String location = scan.nextLine();

            bikeShop.addDepartment(departmentName, typeOfGoods, service, location);

            System.out.println("Enter 'exit' to exit ");
            String exit = scan.nextLine();
            if (exit.equals("exit")) {
                break;
            }
        }
        System.out.println(bikeShop);
    }
}