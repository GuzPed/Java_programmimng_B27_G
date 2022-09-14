package day18_loops_1;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        /*
        write a program that will allow you to guess a secret number.
    Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
    They will guess a number and get a response. They can keep guessing until they get is right
        give hints:
            number is bigger
            number is smaller

    bonus: keep track of the number of attempts it took to guess the number
         */
        Scanner input = new Scanner(System.in);
        int secretNumber = 75;
         int sumOfAttempts = 0;
         boolean guessNumber = false;

        while (!guessNumber) {
            System.out.println("Enter the number");
            int number = input.nextInt();

            if (secretNumber != number) {

                if (number > secretNumber) {
                    System.out.println("number is smaller");
                } else {
                    System.out.println("number is bigger");
                }

            } else {
                guessNumber = true;
                System.out.println("you won");
            }

            sumOfAttempts++;
        }
        System.out.println("number of Attempts: " + sumOfAttempts);
    }
}
