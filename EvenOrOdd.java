package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //int x ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        if ( x %2 == 0) {
            System.out.println("Even Number");

        }else {
            System.out.println("Odd Number");
        }
    }
}
