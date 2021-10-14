package com.old.files;

/**
 * Created by aasingh on 12/06/18.
 */
public class Reverse {

    public static void main(String[] args){

        StringBuilder result=new StringBuilder();
        String  string=new String("aakash singh kushwah");

        for (String s2:string.split(" ")){

            String s1=new String(new StringBuffer(s2).reverse());
            String s3=Character.toUpperCase(s1.charAt(0))+s1.substring(1);
            result.append(s3+" ");
        }

        System.out.print(result.toString().trim());

       String rs="roshan";

        String nw="Ek}the}Villian";

       for(char ch: rs.toCharArray()){
         //  System.out.println(Integer.toString(ch)+65);
        //   Integer t=Integer.toString(ch)-32;
          // System.out.println((ch+32));
           System.out.println((char)(ch-32));
       }

       for(String s:nw.split(""))
       System.out.println(s);

    }
}
