package com.practice.gkg;

import java.util.Scanner;

public class SumOfNaturalNo {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nn = sc.nextInt();
            if (nn <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                long sum = (long) nn * (nn + 1) / 2;
                System.out.println("Sum of first " + nn + " natural numbers is: " + sum);
            }
        }
    }
}
