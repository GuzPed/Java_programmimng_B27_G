package day18_loops_1;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        /*
        Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
         */
        Scanner input = new Scanner(System.in);
        boolean positive = true;
        int sum = 0;

        while (positive) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number>=0) {
                sum += number;
            } else {
                positive = false;
            }
        }
        System.out.println(sum);
    }
}
