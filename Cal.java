package com.bridgelabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cal {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.print("Enter the First Number:");
        double num1 = Double.parseDouble(reader.readLine());

        System.out.print("Enter the First Number:");
        double num2 = Double.parseDouble(reader.readLine());

        System.out.print("Arithmetic Operators '+', '-', '*', '%', '/':");
        String operator = reader.readLine();
        if (operator.equals("+")) {
            double sum = num1 + num2;
            System.out.println("Sum:" + sum);
                    } else if (operator.equals("-")) {
            double sub = num1 - num2;
            System.out.println("Sub:" + sub);
        } else if (operator.equals("*")) {
            double mult = num1 * num2;
            System.out.println("mult:" + mult);
        } else if (operator.equals("%")) {
            double perc = num1 % num2;
            System.out.println("perc:" + perc);
                    } else if (operator.equals("/")) {
            double div = num1 / num2;
            System.out.println("div:" + div);

        }
    }
    }
