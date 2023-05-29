package com.bridgelabz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray {
    static int count;
    public static void main(String[] args) {
        int[] rollNO = {12, 13, 14, 15, 16};
        for (int i = 0; i <= rollNO.length - 1; i++) {
            if (rollNO[i] % 2 == 0) {
                System.out.println(rollNO[i]);
                count += 1;
            }

        }
        System.out.println(count);
    }
}