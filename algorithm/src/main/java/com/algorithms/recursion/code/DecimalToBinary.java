package com.algorithms.recursion.code;

public class DecimalToBinary {
    static StringBuilder sb=new StringBuilder();


    private static int decimalToBinary(int num){
       /* if(num==0){
            return 0;
        }*/
        return num==0?0:num%2+10*decimalToBinary(num/2);
    }
   static int count=0;
    private static double binaryToDecimal(int binary){
        if(binary==0){
            return 0;
        }
        return binary%10*Math.pow(2,count++)+binaryToDecimal(binary/10);
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
      System.out.println(decimalToBinary(34));
      System.out.println(binaryToDecimal(100010));
    }
}
