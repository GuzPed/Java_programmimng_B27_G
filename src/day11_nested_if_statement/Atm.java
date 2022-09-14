package day11_nested_if_statement;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int validPassscode = 7021;
        System.out.println("Enter your pin");
        int usedPasscode = input.nextInt();

        if (usedPasscode == validPassscode) {
            System.out.println("Logged in! Select \n1 - Check Balance \n2 - Withdraw \n3 - Deposit");
            int selectrion = input.nextInt();
            if (selectrion ==1) {
                System.out.println("your balance $1000000");
            } else if (selectrion==2) {
                System.out.println("how much would you like to widthraw");
                System.out.println( " withdraw " + input.nextInt());
            } else if (selectrion ==3) {
                System.out.println("enter amount of money you want to deposit");
                System.out.println("deposit " + input.nextInt());
            }


        } else {
            System.out.println("cancel");
        }


    }
}
