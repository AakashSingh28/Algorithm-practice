package com.algorithms.array.code;

public class FindTheMissingNumber {


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(arr));
    }
    private static int missingNumber(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=1){
                return arr[i]+1;
            }
        }
        return 0;
    }
}
