package com.bridgelabz;

public class TwoDArray {
    public static void main(String[] args) {
      //  int arr [] [] = new int [][];
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <= arr.length-1 ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
