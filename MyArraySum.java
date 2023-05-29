package com.bridgelabz;

public class MyArraySum {


    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i <= numbers.length-1 ; i++) {
            sum = sum+numbers[i];

        }
        System.out.println(sum);
    }
}
