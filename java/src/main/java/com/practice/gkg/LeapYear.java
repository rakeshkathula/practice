package com.practice.gkg;

public class LeapYear {


    // Method to check leap year
    public static void isLeapYear(int year) {
        // A year is a leap year if:
        // 1. It is divisible by 4 AND NOT divisible by 100
        // OR
        // 2. It is divisible by 400
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " : Leap-year");
        } else {
            System.out.println(year + " : Non Leap-year");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Calling our function by
        // passing century year not divisible by 400
        isLeapYear(2000);

        // Calling our function by
        // passing Non-century year
        isLeapYear(2002);
    }
}
