package com.old.files;


public class Sample {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = arr.length;
        int n = 7;
        rotate(arr, d, n);
    }

    private static void rotate(int arr[], int d, int n) {

        int temp=arr[d-1];

        for (int i=n;i>d;i--){
            arr[i-1]=arr[i];
        }

        printArray(arr);
    }


    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
