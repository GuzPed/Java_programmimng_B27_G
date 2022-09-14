package day09_if_statements;

import java.util.Scanner;

public class CharVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter letter or number or special character");
        char a = input.next().charAt(0);

        if ((a >= 'a' && a <= 'z') || (a >='A' && a <= 'Z')) {
            System.out.println("It's a letter");
        } else if (a>='0' && a<='9') {
            System.out.println("It's a number");
        } else {
            System.out.println("It's a special character");
        }



    }
}
