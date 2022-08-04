package com.algorithms.array.code;

import java.util.Arrays;

public class Transpose {

    // This in place solution only works for n==m matrix
    // for m!=n matrix we need to have extra space
    private static int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    return matrix;
    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before "+ Arrays.deepToString(matrix));
        System.out.println("After "+Arrays.deepToString(transpose(matrix)));
    }
}
