package com.bridgelabz;

import java.util.Scanner;

public class PositiveOrNegative3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Positive");

        } else if (number < 0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }

}
