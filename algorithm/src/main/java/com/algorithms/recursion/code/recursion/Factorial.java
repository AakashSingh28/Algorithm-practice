package com.algorithms.recursion.code.recursion;

public class Factorial {
    public static int factorial(int num){
        if (num < 0){
            return -1;
        }
        if (num==1 || num==0){
            return 1;
        }
        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(10));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(-1));
    }
}
