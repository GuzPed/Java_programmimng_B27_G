package day16_string_methods_3;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastname = input.next();

        System.out.println("" + firstName.toUpperCase().charAt(0) + lastname.toUpperCase().charAt(0));



    }

}
