package com.practice.gkg.functions;

public class FindSumFirstLastDigit {

    public static int sumOfFirstandLastDigit(int n) {

        // convert given integer to string
        String s = Integer.toString(n);

        // get the first character
        int firstN = Character.getNumericValue(s.charAt(0));
        // get the last character
        int lastN = Character.getNumericValue(s.charAt(s.length() - 1));

        // do the sum and return
        return firstN + lastN;

    }

    public static void main(String[] args) {

        int num = 123456;
        System.out.println("Sum of First and Last digit of " + num + " is: " + sumOfFirstandLastDigit(num));
    }

}
