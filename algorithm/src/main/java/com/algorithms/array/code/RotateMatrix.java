package com.algorithms.array.code;

import java.util.Arrays;

public class RotateMatrix {

    private static int[][]   rotateMatrix(int[][] matrix){
        if(matrix.length!=matrix[0].length){
            return new int[0][0];
        }
        //Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }


        return matrix;
    }


    /*
    *              00 01 02               00 10 20      20 10 00
    *              10 11 12               01 11 21      21 11 01
    *              20 21 22               02 12 22      22 12 02
    *
    * */
/*
for (int i = 0; i < matrix.length; i++) {
        int left = 0, right = col-1;
        while(left < right) {
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }
    }*/
    public static void main(String[] args) {
        int [][]matrix1={{1,2,3},{4,5,6},{7,8,9}};
       // int [][]matrix={{1,2},{4,5},{7,8}};
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Before "+Arrays.deepToString(matrix));
        System.out.println("After "+Arrays.deepToString(rotateMatrix(matrix)));

    }
}
