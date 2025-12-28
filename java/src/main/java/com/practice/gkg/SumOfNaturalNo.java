package com.practice.gkg;

import java.util.Scanner;

public class SumOfNaturalNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        int sum = 0;
        sum = (nn * (nn + 1)) / 2;
        System.out.println("Sum of first " + nn + " natural numbers is: " + sum);
    }
}
