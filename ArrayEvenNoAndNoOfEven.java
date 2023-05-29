package com.bridgelabz;

public class ArrayEvenNoAndNoOfEven {
    static int evenNumbers;
    static int [] empNo = new int[5];
    static  int sumOfEven;
    public static void methodCountEven(){
                for (int i = 0; i <= empNo.length-1 ; i++) {
            if (empNo [i] % 2 == 0 && empNo[i] !=0) {
                System.out.println(empNo[i]);
                evenNumbers += 1;
             sumOfEven += empNo[i];

            }
        }
        System.out.println(evenNumbers);
        System. out. print("sumOfEven:  " + sumOfEven);
    }
    public static void main(String[] args) {
      // empNo  = {100, 101, 102, 103, 104, 105};
        empNo[0]= 100;
        empNo[2]= 299;
        empNo[3]= 400;
    methodCountEven();
    }

}
