package com.bridgelabz;

public class EvNoOfEvInAr {
    static int noofeven;
    static int sumeven;
    public static void evNoAndCount(){
        int [] empId = {10,20,30,40,50};
        for (int i = 0; i <=empId.length-1 ; i++) {
            if ( empId[i] % 2 == 0) {
              // System.out.println(empId[i]);
                noofeven += i;
                sumeven += empId[i];
             }

        }
        //System.out.println(noofeven);
        System.out.println(sumeven);
    }
    public static void main(String[] args) {
        int count;
        evNoAndCount();
    }
}
