package com.practice.gkg.loops;

public class BreakStmt {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 2)
                break;
            System.out.println("value of i: " + i);
        }
        System.out.println("After break  ");
    }
}
