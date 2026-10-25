package com.practice.gkg.loops;

import java.util.Scanner;

public class CountOfDigits {

    public static void main(String[] args) {

        int n, answ = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n > 0) {
            // n/10 chop of the last digit as 1027/10 -> 102 not 102.7 as it is integer
            n = n / 10;
            answ++;
        }
        System.out.println("no of digits is: " + answ);
    }

}
