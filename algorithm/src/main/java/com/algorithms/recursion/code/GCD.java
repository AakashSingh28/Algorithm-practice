package com.algorithms.recursion.code;

public class GCD {

    private static int gcd(int num1,int num2){
        if (num2<0){
            return -1;
        }
        if (num2==0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
    public static void main(String[] args) {
                System.out.println(gcd(12,16));
                System.out.println(gcd(16,16));
    }
}
