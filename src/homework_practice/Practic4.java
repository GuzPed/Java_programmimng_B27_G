package homework_practice;

import java.util.Scanner;

public class Practic4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();

        boolean isDivisibleBy2 = a%2==0;
        boolean isDivisibleBy3 = a%3==0;
        boolean isDivisibleBy5 = a%5 ==0;

        System.out.println("isDivisibleBy2 = " + isDivisibleBy2);
        System.out.println("isDivisibleBy3 = " + isDivisibleBy3);
        System.out.println("isDivisibleBy5 = " + isDivisibleBy5);



    }
}
