package com.algorithms.array.code;
import java.util.Arrays;

public class TwoSum {

    private static int[] twoSum(int[] arr,int targetSum){
      int[] result=new int[2];
      for (int i=0;i<arr.length;i++){
          int val1=targetSum-arr[i];
          for (int j=0;j<arr.length;j++){
             if(val1==arr[j]){
                 result[0]=arr[i];
                 result[1]=arr[j];
              return result;
             }
          }
      }
      return result;
    }

    public static void main(String[] args) {
   int []arr={2,6,3,9,11};
       System.out.println(Arrays.toString(twoSum(arr,11)));
    }
}
