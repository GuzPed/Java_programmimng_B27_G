package day27_multi_array_methods;

import java.util.Scanner;

public class Task3 {
    /*
    create a method that will accept an age and determine if the person is eligible to vote. Person must be 18 years or older to vote
     */
    public static void eligibleToVote(int date) {

        int currentYear = 2022;
        int maxYear = currentYear-100;

        if (date > currentYear || date < maxYear) {
            System.out.println(" Or you are not born yet or already read");
        } else {

            int eligAge=2022-date;

        if (eligAge>=18) {
            System.out.println("elegible to vote");
        } else {
            System.out.println("still too young to vote");
        }

    }}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        eligibleToVote(input.nextInt());


    }

}
