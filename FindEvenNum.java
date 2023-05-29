package com.bridgelabz;

public class FindEvenNum {
    static  int count ;
    public static void main(String[] args) {
          int numofevenno = 0;
          for (int i = 1; i<=10 ; i++) {
              if (i % 2 == 0) {
                 //System.out.println(i + " No of Even Numbers " + count++);
                  System.out.println(i);
                  count = count+1;
                  numofevenno += i;
                                  }

             // System.out.println(count++);
        }
       // System.out.println(sumofeven);
        System.out.println(count);

       // System.out.println(count++);
    }
}
