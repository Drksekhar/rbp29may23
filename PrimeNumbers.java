package com.bridgelabz;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 50;
        int prime = 0;
        for (int i = 2; i<num/2 ; i++) {
            if (num%i == 0) {
                prime++;
                break;
            }
        }
        if (prime == 0) {
            System.out.println("number is a prime");
        } else {
            System.out.println("number is not a prime");
        }
    }
}
