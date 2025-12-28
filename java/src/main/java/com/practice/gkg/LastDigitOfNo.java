package com.practice.gkg;

import java.util.Scanner;

public class LastDigitOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = Math.abs(x);
        int z = y % 10;
        System.out.println("Last Digit of given number: " + y + " is " + z);
        sc.close();
    }
}
