package com.bridgelabz;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number , it tells whether it is Even or Odd");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number which enter is ' " + num +" ' It is a Even Number");
            }else {
            System.out.println("The number which enter is ' " + num +" ' It is a Odd Number");
        }
    }
}
