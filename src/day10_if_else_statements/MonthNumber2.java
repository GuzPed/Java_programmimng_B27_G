package day10_if_else_statements;
import java.util.Scanner;

public class MonthNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int a = input.nextInt();
        int day = 0;
        boolean is31Days= a == 1 || a == 3 || a == 5 || a==7 || a==8 || a==10 ||a==12;
        boolean is30Days = a == 4 || a ==6 ||a ==9 || a==11;

        if (is31Days) {
            day = 31 ;
        } else if (is30Days) {
            day = 30;
        } else if (a == 2) {
            day = 28;
        }

        if (day > 0) {
            System.out.println( "Month " + a);
            System.out.println(day + " days");
        } else {
            System.out.println("Invalid number of month");
        }


}}
