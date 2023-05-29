package com.bridgelabz;

public class MyMethod {
   public static void myGreetMessage(){
       System.out.println("Hello");
   }
public static  int sumOfTwoNum(int a, int b){
       int sum = a+b;
       return sum;
}
    public static void main(String[] args) {
       myGreetMessage();
       int result = sumOfTwoNum(10,20);
        System.out.println(result);
    }
}
