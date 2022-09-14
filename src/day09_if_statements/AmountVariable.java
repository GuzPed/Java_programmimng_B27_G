package day09_if_statements;

import java.util.Scanner;

public class AmountVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your sales amount to know your bonus");
        int a = input.nextInt();

        if (a<10_000) {
            System.out.println("you don't get any bonus");
        }
        if (a>=10_000 && a<15_000) {
            System.out.println("you get a bonus of $5000");
        }
        if (a>=15_000) {
            System.out.println("you get of bonus $7000");
        }


    }
}
