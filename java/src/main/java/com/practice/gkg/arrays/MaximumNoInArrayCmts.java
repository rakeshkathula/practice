package com.practice.gkg.arrays;

/*
 * PROGRAM PURPOSE:
 * This program finds the largest number in an integer array.
 *
 * INPUT  -> An integer array and its size.
 * OUTPUT -> The largest number present in the array.
 *
 * Example:
 * Input  -> {1, 2, 9, 8, 7, 6, 101}
 * Output -> 101
 */
public class MaximumNoInArrayCmts {

    /*
     * METHOD PURPOSE:
     * Finds and returns the maximum number from the array.
     *
     * arr -> The array containing numbers.
     * n -> Total number of elements in the array.
     */
    public static int maxInArray(int[] arr, int n) {

        // i is used to access each array element.
        // ans stores the largest number found so far.
        //
        // Initially, assume the first element is the maximum.
        int i, ans = arr[0];

        System.out.println("Starting maximum number calculation...");
        System.out.println("Initial maximum (ans): " + ans);

        // Loop through the array one element at a time.
        for (i = 0; i < n; i++) {

            System.out.println("\nChecking index: " + i);
            System.out.println("Current element: " + arr[i]);
            System.out.println("Previous maximum: " + ans);

            // Math.max() compares two numbers and returns
            // whichever number is greater.
            //
            // Compare the current array element with
            // the maximum number found so far.
            ans = Math.max(arr[i], ans);

            System.out.println("Updated maximum (ans): " + ans);
        }

        // After checking all elements, return the largest number.
        System.out.println("\nCalculation completed!");
        System.out.println("Final maximum number: " + ans);

        return ans;
    }

    // Main method: Program execution starts here.
    public static void main(String[] args) {

        // Declare and initialize an integer array.
        int arr[] = { 1, 2, 9, 8, 7, 6, 101 };

        // Find the total number of elements in the array.
        int n = arr.length;

        System.out.println("Input Array:");

        // Display all elements of the array.
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println("\n");

        // Call maxInArray() and store its returned value.
        int result = maxInArray(arr, n);

        // Display the final answer.
        System.out.println("\nMaximum number in array: " + result);
    }
}
