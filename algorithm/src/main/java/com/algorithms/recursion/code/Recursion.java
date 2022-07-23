package com.algorithms.recursion.code;

public class Recursion {
    public static int factorial(int num){
        return num==0?1:num*factorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(10));
        System.out.println(factorial(9));
    }
}
