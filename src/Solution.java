import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int[][] hourglassSum(int[][] arr) {
        int[]array= new int[16];
        int[][]arrayHourglass= new int[3][3];
        int arrayIndex=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[arrayIndex]=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+
                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                arrayIndex=arrayIndex+1;
            }
        }
        int max=array[0];
        for ( int i = 1; i <16 ; i++) {
            if (array[i]>max){
                max=array[i];
                arrayIndex=i;
            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
                arrayHourglass[i][j]=arr[arrayIndex/4+i][arrayIndex%4+j];
            }
        }
return arrayHourglass;
    }


//    public static void main(String[] args) {
//        int arr[][]={{0,1,2,3,4,5,6},
//                {0,1,2,3,4,5,6},
//                {0,1,2,3,4,5,6}, {0,1,2,3,4,5,6},
//                {0,1,2,3,4,5,6},{0,1,2,3,4,5,6}};
//        int arr2[][]=hourglassSum({{0,1,2,3,4,5,6},
//                {0,1,2,3,4,5,6}});
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {System.out.println()
//    }
}
