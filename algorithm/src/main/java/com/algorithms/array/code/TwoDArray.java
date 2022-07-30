package com.algorithms.array.code;

public class TwoDArray {

    static int[][] twoDArray(){
        int [][]twoDArray=new int[3][3];

        for (int i=0;i<twoDArray.length;i++){
            for (int j=0;j<twoDArray[0].length;j++){
             twoDArray[i][j]=i+10+j;
            }
        }
        return twoDArray;
    }

    public static void main(String[] args) {
        for (int i=0;i<twoDArray().length;i++){
            for (int j=0;j<twoDArray()[0].length;j++){
                if(i==j){
                    System.out.print(twoDArray()[i][j]+" ");
                }
              //  System.out.print(twoDArray()[i][j]+" ");
            }
            System.out.println();
        }
    }
}
