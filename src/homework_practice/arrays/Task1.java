package homework_practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    /*
    Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message

    Ex:
> 1
        one

> 10
        ten
     */

    public static void main(String[] args) {

        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

        System.out.println("Enter the number from0 to 15");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num <0 && num>15) {
            System.out.println("Wrong number");
        } else {
            System.out.println(numbers[num]);
        }



    }
}
