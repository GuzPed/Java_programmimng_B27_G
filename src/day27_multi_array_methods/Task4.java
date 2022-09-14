package day27_multi_array_methods;

import java.util.Scanner;

public class Task4 {
    /*
    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */
    public static void number(int number){

        if (number >0) {
            System.out.println("Positive numver " + number);
        } else if (number < 0) {
            System.out.println("Negative number " + number);
        } else {
            System.out.println(" It is Zero");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number");
        number(input.nextInt());
    }



}
