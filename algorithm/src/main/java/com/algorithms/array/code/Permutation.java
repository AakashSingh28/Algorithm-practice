package com.algorithms.array.code;

public class Permutation {

    //Permutation of each other
    private static boolean isPermutationOfEachOther(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length){
           return false;
        }
         int sum1=0;
         int sum2=0;
         int product1=1;
         int product2=1;
        for (int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
            sum2+=arr2[i];
            product1*=arr1[i];
            product2*=arr2[i];
        }
        if(sum1==sum2 && product1==product2){
            return true;
        }
        return false;
    }

    //Not for each other
    private static boolean isPermutation(int[] arr1,int[] arr2){
        boolean isMatch=false;
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                isMatch = true;
                count = 0;
            } else {
                isMatch=false;
            }
        }

        return isMatch;
    }

    public static void main(String[] args) {
        int []arr1={2,1,3,5,4,6};
        int []arr2={1,3,2,4,5,6};

        System.out.println(isPermutation(arr1,arr2));
        System.out.println(isPermutationOfEachOther(arr1,arr2));
    }
}
