package com.minarchenko;

import java.util.Random;
import java.util.Scanner;

public class MatrixTurn {
    public static void main(String[] args) {
        int number = input();
        int[][] matrix = matrixGeneration(number);
        int[][] matrix2 = turn(number, matrix);
        output(number, matrix);
        System.out.println();
        output(number, matrix2);
    }

    private static int[][] turn(int number, int[][] matrix) {
        int[][] matrix2 = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                matrix2[i][j] = matrix[j][number - i - 1];
            }
        }
        return matrix2;
    }

    private static int[][] matrixGeneration(int number) {
        int[][] matrix = new int[number][number];
        Random random = new Random();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                matrix[i][j] = random.nextInt() % 100;
            }
        }
        return matrix;
    }

    private static int input() {
        Scanner scan = new Scanner(System.in);
        int numMax = scan.nextInt();
        scan.close();
        return numMax;
    }

    private static void output(int number, int[][] matrix) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
