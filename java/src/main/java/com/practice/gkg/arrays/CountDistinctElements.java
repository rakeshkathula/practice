package com.practice.gkg.arrays;

class CountDistinctElements {

    /*
     * PROGRAM PURPOSE:
     * This program counts how many unique (distinct) elements
     * are present in an integer array.
     *
     * INPUT -> An integer array and its size.
     * OUTPUT -> Total number of distinct elements.
     *
     * Example:
     * Input -> {10, 20, 10, 30, 20}
     * Output -> 3
     */

    // This method counts the distinct elements in the array.
    static int distinct(int arr[], int n) {

        // i = Current element position.
        // j = Used to check previous elements.
        // ans = Stores the number of distinct elements.
        int i, j, ans = 0;

        System.out.println("Starting distinct element calculation...");
        System.out.println("Array size: " + n);

        // Outer loop: Visits each element one by one.
        for (i = 0; i < n; i++) {

            System.out.println("\nChecking element at index: " + i);
            System.out.println("Current element: " + arr[i]);

            // Inner loop: Checks whether the current element
            // already appeared in any previous position.
            //
            // i - 1 means start checking from the previous index.
            // j >= 0 means continue until the first array element.
            // j-- means move backwards one position at a time.

            for (j = i - 1; j >= 0; j--) {

                System.out.println("Comparing arr[" + j + "] = "
                        + arr[j] + " with arr[" + i + "] = " + arr[i]);

                // If both elements are equal, we found a duplicate.
                if (arr[j] == arr[i]) {

                    System.out.println("Duplicate found! Element "
                            + arr[i] + " already exists.");

                    // Stop checking because we already found a duplicate.
                    break;
                }
            }

            // If j becomes -1, it means the inner loop checked
            // all previous elements and did not find a duplicate.
            if (j == -1) {

                ans++;

                System.out.println("No duplicate found.");
                System.out.println("Unique element: " + arr[i]);
                System.out.println("Updated distinct count: " + ans);

            } else {

                System.out.println("Element " + arr[i]
                        + " is already counted. Count remains: " + ans);
            }
        }

        // Return the final number of distinct elements.
        System.out.println("\nCalculation completed!");
        System.out.println("Total distinct elements: " + ans);

        return ans;
    }

    // Main method: Java starts executing the program from here.
    public static void main(String[] args) {

        // Sample input array.
        int arr[] = { 10, 20, 10, 30, 20 };

        // Store the size of the array.
        int n = arr.length;

        System.out.println("Input Array: ");

        // Print all array elements.
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println("\n");

        // Call distinct() method and store its returned result.
        int result = distinct(arr, n);

        // Display the final answer.
        System.out.println("\nFinal Answer: " + result);
    }
}