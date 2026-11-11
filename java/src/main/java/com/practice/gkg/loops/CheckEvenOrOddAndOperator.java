package com.practice.gkg.loops;

public class CheckEvenOrOddAndOperator {

    public static void main(String[] args) {
        int n = 101;

// Examples:
// 15 -> 1 1 1 1
//      &0 0 0 1
//      -------
//        0 0 0 1 , so this we can say it is an odd number.
// 44 -> 1 0 1 1 0 0
// &     0 0 0 0 0 1
//        ----------
//        0 0 0 0 0 0 , so this we can say it is an even number.

        if ((n & 1) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }

}
