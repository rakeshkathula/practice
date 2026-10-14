package com.practice.gkg;

import java.util.Scanner;

/**
 * Extracts and displays the last digit of an absolute value number.
 */
public class LastDigitOfNo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int inputNumber = scanner.nextInt();
            int absoluteValue = Math.abs(inputNumber);
            int lastDigit = absoluteValue % 10;
            System.out.println("Last digit of " + absoluteValue + " is " + lastDigit);
        }
    }
}
