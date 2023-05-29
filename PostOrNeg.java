package com.bridgelabz;

import java.util.Scanner;

public class PostOrNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }else {
            System.out.println("zero");
        }
    }
}
