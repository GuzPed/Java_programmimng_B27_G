package day10_if_else_statements;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
    /*
    You are diving in the ocean. Your oxygen tank has a certain level (number)
declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:
    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%
     */
        Scanner input= new Scanner (System.in);
        System.out.println("What is the level of the oxygen tank? from 0 to 100");
        int a = input.nextInt();
        String result = (a>=90)? "Your tank is full": (a>=80)? "Still okay" : (a>=70)? "Don't go too far": (a>60)? "Start to head back": (a>=50)? "Be careful now you at 50%" : "You gonna die";
        System.out.println(result);









    }
}
