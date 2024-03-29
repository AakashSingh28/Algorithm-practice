package com.other;

public class RotateArray {


    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n)
    {
       for(int i=1;i<=d;i++){
           leftRotatebyOne(arr,n);
       }
    }

    void leftRotatebyOne(int arr[], int n)
    {
        int i;int temp=arr[0];
        for(i=0;i<n-1;i++)
            arr[i]=arr[i+1];
        arr[i]=temp;
    }

    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        RotateArray rotate = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 4, 7);
        rotate.printArray(arr, 7);
    }
}
