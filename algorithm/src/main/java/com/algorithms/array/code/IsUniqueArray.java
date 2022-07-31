package com.algorithms.array.code;

public class IsUniqueArray {

    private static boolean isUniqueArray(int []arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j<arr.length; j++) {
                if(i!=j && arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={30,2,35,66,30,2};
        System.out.println(isUniqueArray(arr));
    }
}
