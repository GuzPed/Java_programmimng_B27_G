package day18_loops_1;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int validPin = 1234;
        int userPin;
        int attemps = 0;

        Scanner input = new Scanner (System.in);

        do { // purpose of this loop was to allow reattempts logic
            System.out.println("enter your pin");
            userPin = input.nextInt();
            attemps++;
        } while (userPin!=validPin && attemps<3);


        if (attemps<=3 && userPin == validPin) {
            System.out.println("Logged in");
        } else {
        System.out.println("too many attemps"); }





    }
}
