package day09_if_statements;

import java.util.Scanner;

public class TheDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        int a = input.nextInt();
        if (a == 1){
            System.out.println("Monday");
        } else if (a ==2){
            System.out.println("Tuesday");
        } else if (a ==3){
            System.out.println("Wednesday");
        } else if (a ==4){
            System.out.println("Thursday");
        } else if (a ==5){
            System.out.println("Friday");
        } else if (a ==6){
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

    }
}
