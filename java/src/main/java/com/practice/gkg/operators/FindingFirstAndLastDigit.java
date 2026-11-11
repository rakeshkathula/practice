package com.practice.gkg.operators;

public class FindingFirstAndLastDigit {

    public static int firstDigit(int n) {
        while (n >= 10)
            n /= 10;
        return n;
    }

    public static int lastDigit(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        System.out.println("First digit is: " + firstDigit(194) + "Last Digit is: " + lastDigit(194));
    }

}
