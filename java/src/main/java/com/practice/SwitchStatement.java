package com.practice;

public class SwitchStatement {

    public static void main(String[] args) {
        int day = 2;
        String dayType;
        String weekOrWeekend;

        switch (day) {

            case 1:
                dayType = "Monday";
                break;

            case 2:
                dayType = "Tuesday";
                break;
            case 3:
                dayType = "Wednesday";
                break;
            case 4:
                dayType = "Thursday";
                break;
            case 5:
                dayType = "Friday";
                break;
            case 6:
                dayType = "Saturday";
                break;
            case 7:
                dayType = "Sunday";
                break;
            default:
                dayType = "Invalid Day";

        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                weekOrWeekend = "WeekDay";
                break;
            case 6:
            case 7:
                weekOrWeekend = "WeekEnd";
                break;
            default:
                weekOrWeekend = "Invalid Day";
                break;
        }

        System.out.println("dayType is " + dayType + " WeekendOrWeekday is "+ weekOrWeekend);

    }

}
