package com.algorithms.recursion.code;

public class Fibonacci {


    private  static int fibonacci(int num){
        if(num<0){
            return -1;
        }
        if(num==0 || num==1){
           return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }

    public static void main(String[] args) {
        fibonacci(-10);

    }
}
