package com.minarchenko.taskOne;

import java.util.*;

public class Pyramid {

    public static void main(String[] args) {
        int numMax = input();
        int[][] piramid = calculate(numMax);
        output(numMax, piramid);
    }

    private static int input() {
        Scanner scan = new Scanner(System.in);
        int numMax = scan.nextInt();
        scan.close();
        return numMax;
    }

    private static void output(int numMax, int[][] piramid) {
        for (int i = 0; i < numMax; i++) {
            for (int j = 0; j < 2 * numMax - 1; j++) {
                if (piramid[i][j] != 0) {
                    System.out.print(piramid[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] calculate(int numMax) {
        int[][] piramid = new int[numMax][2 * numMax + 1];
        int k = 1;
        for (int i = 0; i < numMax; i++) {
            for (int j1 = (2 * numMax - 1) / 2 - i; j1 <= (2 * numMax - 1) / 2; j1++) {
                piramid[i][j1] = k;
                k++;
            }
            k--;
            for (int j2 = (2 * numMax - 1) / 2; j2 <= (2 * numMax - 1) / 2 + i; j2++) {
                piramid[i][j2] = k;
                k--;
            }
            k = 1;
        }
        return piramid;
    }


}

