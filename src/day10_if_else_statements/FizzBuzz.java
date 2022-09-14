package day10_if_else_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number");
        int a = input.nextInt();
        String b;


        if (a%3==0 && a%5==0){
        b= "FizzBuzz";
        }  else if (a%5==0) {
            b= "Buss";
        } else if (a%3==0){
            b= "Fizz";
        }
        else {
            b= "It is not divisible by any number";
        }
        System.out.println(a);
        System.out.println(b);


    }


}
