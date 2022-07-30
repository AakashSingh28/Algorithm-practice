package com.algorithms.array.code;

public class FindTheMissingNumber {


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,10};
        System.out.println(missingNumber(arr));
        // Using n(n+1)/2
        System.out.println(missingNumberWithAP(arr));
    }
    private static int missingNumber(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=1){
                return arr[i]+1;
            }
        }
        return 0;
    }

    private static int missingNumberWithAP(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return 10*(10+1)/2-sum;
    }
}
