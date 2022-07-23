package com.algorithms.recursion.code;

/*
Find sum of digits of a number
f(n)=f(n%10)+f(n/10)
**/

public class SumOfDigits {

    private static int sumOfDigits(int num){
        if(num==0){
           return 0;
        }
        return num%10+sumOfDigits(num/10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(98));
    }
}
