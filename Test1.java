package com.practice.array;

import java.util.HashMap;

/**
 * Created by aasingh on 13/06/18.
 */
public class Test1 {

    public static void main(String[] args) {

        String s = "aakash singh";
        // reverse(s);
        char[] ch = s.toCharArray();
        int count1 = 0;
        HashMap hashMap=new HashMap();
        for (int i = 0; i < ch.length-1; i++) {
            for (int j =0;j< ch.length-1; j++){
                if(ch[i]==ch[j+1]){
                    count1++;
                }
                hashMap.put(ch[i],count1);
            }

            count1=0;
        }


        System.out.println("unique  "+hashMap);

        int count = 0;
        for (char c : ch) {

            if (c == ' ') {
                count++;
            }
        }

        System.out.println(count);


        int[] arr = {1, 7, 2, 3, 45, 55, 31, 11, 99};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    static int count = 1;

    static String reverse(String s) {
        if (s == null) {
            return null;
        }
        if (count != s.length() + 1) {
            System.out.println(s.charAt(s.length() - count));
            count++;
            return reverse(s);
        }
        return null;
    }

}
