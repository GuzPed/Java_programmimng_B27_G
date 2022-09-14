package homework_practice.loops_practices;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       int num1 = 1;
       int num2 =50;


        while (num1<=num2) {

            if (num1%3==0 && num1%5==0) {
                System.out.println( num1 + " FizzBuzz");
            } else if (num1%3==0) {
                System.out.println(num1 +  " Fizz");
            } else if (num1%5==0) {
                System.out.println(num1 + " Buzz");
            } else {
                System.out.println(num1);
            }

            num1++;
        }


    }



}
