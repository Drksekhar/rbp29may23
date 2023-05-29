package com.bridgelabz;

public class MyArray2 {
    public static void main(String[] args) {
        int i;
        int count =0;
        int sum = 0;
        int [] arrayNum = {1,2,3,4,5,6,7,8,9,10,11};
        for ( i = 0; i <=arrayNum.length-1 ; i++) {
            if (arrayNum [i]  % 2 == 0) {
                System.out.println("Even numbers in Array: " +arrayNum[i]);
                count = count+1;
                sum = sum+arrayNum[i];
            }

        }
        System.out.println("No of Even numbers in Array: " +count);
        System.out.println("The sum of Even numbers in Array: " +sum);
    }
}
