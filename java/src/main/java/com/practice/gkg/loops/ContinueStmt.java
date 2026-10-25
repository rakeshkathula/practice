package com.practice.gkg.loops;

public class ContinueStmt {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            // skips 2 as during i =2 skipping that iteration and continue with the other
            // iteration
            if (i == 2) {
                continue;
            }
            
            System.out.println(i);
        }
    }

}
