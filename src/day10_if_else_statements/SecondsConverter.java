package day10_if_else_statements;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter seconds");
        int second= input.nextInt();
        int minute = 60;
        int hour = 60*minute; //3600

        int a = second/hour; //hours   second/hour = whole number
        int b = (second%hour)/minute; // remainder = minutes    second % hour = the rest of number
        int c = (second%hour)%minute ; // seconds
        System.out.println("" + a + " hours, " + b + " minutes, " + c + " seconds ");








    }

}
