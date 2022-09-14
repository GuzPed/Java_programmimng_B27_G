package day09_if_statements;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int a = input.nextInt();
        int day = 0;

        if (a == 1 || a == 3 || a == 5 || a==7 || a==8 || a==10 ||a==12) {
            day = 31 ;
        } else if (a == 4 || a ==6 ||a ==9 || a==11) {
            day = 30;
        } else {
            day = 28;
        }
        System.out.println(day + " days");


    }

}
