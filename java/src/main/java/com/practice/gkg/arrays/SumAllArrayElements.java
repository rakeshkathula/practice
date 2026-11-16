package com.practice.gkg.arrays;

public class SumAllArrayElements {

    public static int sumAllArrEle(int[] arr, int n) {
        int i, ans = 0;
        for (i = 0; i < n; i++) {
            ans = ans + arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        System.out.println(sumAllArrEle(arr, n));
    }

}
