package day18_loops_1;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        /*
        write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
         */
        Scanner input = new Scanner(System.in);
        int count = 0;
        int howManyPos =0;
        int howManyNeg =0;

        while(count++<5) {
            System.out.println("Enter a number ");
            int number = input.nextInt();

            if (number>=0) {
                howManyPos ++;}
            else {
                howManyNeg++;}
        } System.out.println("positive: " + howManyPos  );
        System.out.println("negative: " + howManyNeg );

    }
}
