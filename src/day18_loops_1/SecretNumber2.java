package day18_loops_1;

import java.util.Scanner;

public class SecretNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 51;
        int sumOfAttempts = 0;
        boolean guessNumber = false;

        do {
            System.out.println("Enter the number");
            int number = input.nextInt();
            if (secretNumber!=number) {
                if (number>secretNumber) {
                    System.out.println("number is smaller");
                } else {
                    System.out.println("number is bigger");
                }
            } else {
                guessNumber = true;
                System.out.println("you won");
            }

            sumOfAttempts+=1;

        } while (!guessNumber);

        System.out.println("number of Attempts: " + sumOfAttempts);




    }



}
