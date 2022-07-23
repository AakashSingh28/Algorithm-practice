package com.other;

public class Google {

//find sub sequence of total 51

    public static void main(String[] args) {
        int a[]={12,1,18,40,2,9,16};
        findSubArray(a,51);
    }

    private static void findSubArray(int[] a,int k) {
        int sum=0;
        int l=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum>k){
                while(sum>k && l<=i){
                    sum-=a[l];
                    l++;
                }
            }
            else if(sum==k)
                System.out.println("range is "+(l)+i);
        }
    }
}
