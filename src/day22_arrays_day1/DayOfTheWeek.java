package day22_arrays_day1;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        /*        Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:
    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday
Use array, not if statement or switch
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" } ;

        if (number>0 && number<=7) {
            System.out.println(days[number-1]);
        } else {
            System.out.println("invalid number");
        }



    }

}
