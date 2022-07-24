package com.algorithms.recursion.code;

public class PowerOfNumber {

    private static int powerOfNumber(int num,int power){
        if(power<0){
            return -1;
        }
        if(power==0 || power==1){
            return num;
        }
        return num * powerOfNumber(num,power-1);
    }

    public static void main(String[] args) {
        System.out.println(powerOfNumber(3,3));
    }
}
