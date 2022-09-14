package day18_loops_1;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;
        int num =0; // to keep track of the iterations

        while (num++ <5) { //  this loop will run for 5 times | start from 1 and go until <=5
            System.out.println("Enter a numbers");
            int number = input.nextInt();

            if (number>max) {
                max = number; // if the new number from the console is bigger than our max number., we found a new max number and should reassigh it to the varialbe
            }
            if (number < min) {
                min = number;
            }



        }
        System.out.println("max - " + max);
        System.out.println("min -" + min);






    }
}
