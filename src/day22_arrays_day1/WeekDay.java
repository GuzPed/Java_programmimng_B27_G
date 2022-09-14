package day22_arrays_day1;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        /*
    Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message
    Ex:
> 1
        one
> 10
        ten
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number from 0 to 15");
                int number = input.nextInt();

                String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

                if (number>=0 && number<=15) {
                    System.out.println(numbers[number]);
                } else {
                    System.out.println("wrong number");
                }





    }
}
