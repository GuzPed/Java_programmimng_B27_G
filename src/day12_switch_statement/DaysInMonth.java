package day12_switch_statement;
/*
Days In Month (slightly different version than before)
Write a program that will accept a month name and outputs how many days are in that month

data:
    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
 */

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month to know how many days in it");
        String month = input.next().toUpperCase();
        int days = 0;

        switch (month){
            case "JANUARY":
            case "MARCH":
            case "MAY":
            case "JULY":
            case "AUGUSTE":
            case "OCTOBER":
            case "DECEMBER":
                days = 31;
                break;
            case "FEBRUARY":
                days = 28;
                break;
            case "APRIL":
            case "JUNE":
            case "SEPTEMBER":
            case "NOVEMBER":
                days = 30;
                break;
            default:
                System.out.println("No such month");

        }
        System.out.println("In this " + month + " there is " + days + " days.");




    }
}
