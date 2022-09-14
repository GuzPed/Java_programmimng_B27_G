package day09_if_statements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();

        if (a % 2 == 0 ){
            System.out.println(a + " is even ");
        }
        if ( a % 2 !=0) {
            System.out.println(a + " is odd");
        }


    }


}
