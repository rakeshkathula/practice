package com.practice.gkg.arrays;

public class MaximumNoInArray {
    public static int maxInArray(int[] arr, int n) {
        int i, ans = arr[0];
        for (i = 0; i < n; i++) {
            ans = Math.max(arr[i], ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 9, 8, 7, 6, 101 };
        int n = arr.length;
        System.out.println(maxInArray(arr, n));
    }
}
