package com.bridgelabz;

public class MyArraySum2 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,};
        int i;
        int sum =0;
        for ( i = 0; i <= num.length-1 ; i++) {
            sum = sum+num[i];

        }
        System.out.println(sum);

    }
}
