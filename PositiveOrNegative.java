package com.bridgelabz;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        //int number = Scanner.nextInt();
        int number = scanner.nextInt();

        //int number = scanner.nextInt();
       // int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("positive");
            } else if (number < 0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

    }
}
