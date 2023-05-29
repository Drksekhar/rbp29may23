package com.bridgelabz;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
             System.out.print("Enter a number");
     //   int num = sc.nextInt();
        String name = sc.nextLine();
        System.out.println("My Name is " + name);
        String fName = "Sekhar";
        String lName = "Kamanuri";
        int age = 45;
        String fullName = fName + lName + age;
        System.out.println(fullName);
     /*                switch (num) {
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("Three");
            break;
        default:
            System.out.println("Enter Valid Number");
    }*/
}
}