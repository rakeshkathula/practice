package com.practice.gkg.operators;

public class FirstLastDigitString {

    public static void main(String[] args) {

        Integer n = 943;

        String no = n.toString();

        // Example for firstDigit ('9' - '0'):

        // The ASCII value of '9' is 57.
        // The ASCII value of '0' is 48.
        // 57 - 48 equals 9.

        int firstDigit = no.charAt(0) - '0';
        int lastDigit = no.charAt(no.length() - 1) - '0';

        System.out.println(firstDigit + " " + lastDigit);
    }

}
