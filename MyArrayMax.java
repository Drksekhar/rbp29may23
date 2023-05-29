package com.bridgelabz;

public class MyArrayMax {
    public static void main(String[] args) {
        int [] num = {6,8,5,10,8};
        int max = num[0];
        int min = num[0];
//        for (int i = 0; i < num.length ; i++) {
//            if (num[i] > max) {
//                max = num[i];
//            }
//
//        }
//        System.out.println(max);

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }

        }
        System.out.println(min);
    }
}
