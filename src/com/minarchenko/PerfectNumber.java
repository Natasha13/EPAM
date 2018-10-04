package com.minarchenko;

import java.util.*;

public class PerfectNumber {

    public static void main(String[] args) {
        int numMax = input();
        List<Integer> listPrefectNumbers = calculate(numMax);
        System.out.println(listPrefectNumbers);
    }

    private static List<Integer> calculate(int numMax) {
        int dividerSum = 0;
        List<Integer> listPrefectNumbers = new ArrayList<>();

        for (int num = 1; num < numMax; num++) {
            for (int i = (num / 2); i > 0; i--) {
                if (num % i == 0) {
                    dividerSum = dividerSum + i;
                }
            }
            if (dividerSum == num) {
                listPrefectNumbers.add(num);
            }
            dividerSum = 0;
        }
        return listPrefectNumbers;
    }

    private static int input() {
        Scanner scan = new Scanner(System.in);
        int numMax = scan.nextInt();
        scan.close();
        return numMax;
    }
}
