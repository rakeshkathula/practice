package com.practice.gkg.loops;

public class NestedSwitch {

    public static void main(String[] args) {

        int year = 2;
        String branch = "CSE";

        switch (year) {
            case 1:

                System.out.println("1st year");
                break;

            case 2:
                switch (branch) {
                    case "CSE":
                    case "CCE":
                        System.out.println("Adv subject are ai and ds");
                        break;
                    default:
                        System.out.println("invalid branch");

                }
                break;
            default:
                System.out.println("invalid year");

        }

    }
}
