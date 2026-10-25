package com.practice.gkg.loops;

public class WhileLoop {

    public static void main(String[] args) {
        int i = 1, s = 0;

        while (i <= 10) {
            s = s + i;
            i++;
        }
        System.out.println("Summation: " + s);
    }

}
