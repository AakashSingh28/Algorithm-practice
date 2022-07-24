package com.algorithms.recursion.code;

public class DecimalToBinary {
    static StringBuilder sb=new StringBuilder();


    private static int decimalToBinary(int num){
        if(num==0){
            return 0;
        }
        return num%2+10*decimalToBinary(num/2);
    }

    /*private static int decimalToBinary(int decimal){
        if(decimal==0){
            System.out.print(sb.reverse());
            return 0;
        }
        int base=decimal/2;
        int binary=decimal%2;
        sb.append(binary);
        return decimalToBinary(base);
    }*/
    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
      //  decimalToBinary(13);
    }
}
