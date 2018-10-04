package com.minarchenko;

import java.util.*;

public class Convertion {

    public static void main(String[] args) {

        int number = input();
        System.out.println(calculate(number, 2));
        System.out.println(calculate(number, 8));
        System.out.println(calculate(number, 16));
    }

    private static String calculate(int number, int divider) {
        String stringResult = "";
        int remainder;

        String resultModeString;
        while (number > 0) {
            remainder = number % divider;
            number = number / divider;

            switch (remainder) {
                case 10:
                    resultModeString = "A";
                    break;
                case 11:
                    resultModeString = "B";
                    break;
                case 12:
                    resultModeString = "C";
                    break;
                case 13:
                    resultModeString = "D";
                    break;
                case 14:
                    resultModeString = "E";
                    break;
                case 15:
                    resultModeString = "F";
                    break;
                default:
                    resultModeString = "" + remainder;
            }
            stringResult = resultModeString + stringResult;
        }
        return stringResult;
    }

    private static int input() {
        Scanner scan = new Scanner(System.in);
        int numMax = scan.nextInt();
        scan.close();
        return numMax;
    }
}

