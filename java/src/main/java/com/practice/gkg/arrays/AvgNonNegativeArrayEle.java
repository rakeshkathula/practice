package com.practice.gkg.arrays;

public class AvgNonNegativeArrayEle {

    public static double avgNonNeg(int[] arr) {
        int i, cnt = 0, n = arr.length;
        double ans = 0;// make it as double other wise the answers are getting differently
        for (i = 0; i < n; i++) {
            if (arr[i] >= 0) {//include zero also
                ans = ans + arr[i];
                cnt++;
            }
        }
        return ans / cnt;
    }

    public static void main(String[] args) {
        int[] arr = { 0, -1, -2, -3, 1, 2, -9, 3, 4, 5 };
        System.out.println(avgNonNeg(arr));
    }

}
