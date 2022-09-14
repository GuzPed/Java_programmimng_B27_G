package day09_if_statements;

import java.util.Scanner;

public class LunchTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" If you are hungry T/F");
        boolean isHungry = input.nextBoolean();
        System.out.println("Is it Lunch Time T/F?");
        boolean isLunchTime = input.nextBoolean();

        if (isLunchTime && isHungry) {
            System.out.println("go and eat lunch, take a break ");
        }
         else {
            System.out.println( "sit and work then ");
        }

    }

}
