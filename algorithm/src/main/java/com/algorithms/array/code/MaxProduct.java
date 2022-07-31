package com.algorithms.array.code;

import java.util.Arrays;

public class MaxProduct {


    private static int maxProductOfTwo(int[] array){
        Arrays.sort(array);
        return array[array.length-1]*array[array.length-2];
    }

    public static void main(String[] args) {
        int []arr={4,6,3,9,10};
        System.out.println(maxProductOfTwo(arr));
    }
}
