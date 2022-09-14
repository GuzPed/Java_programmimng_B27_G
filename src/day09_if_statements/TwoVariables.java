package day09_if_statements;

import java.util.Scanner;

public class TwoVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 2 numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a>b) {
            System.out.println(a + " is bigger");
        } else {
            System.out.println(b + " is bigger");}




    }



}
