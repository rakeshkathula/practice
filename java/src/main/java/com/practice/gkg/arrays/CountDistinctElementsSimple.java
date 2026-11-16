package com.practice.gkg.arrays;

public class CountDistinctElementsSimple {

    public static int distinct(int[] arr, int n) {
        int i, j, ans = 0;
        for (i = 0; i < n; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] == arr[i])
                    break;
            }
            if (j == -1)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7 };
        int n = arr.length;

        System.out.println(distinct(arr, n));
    }

}
