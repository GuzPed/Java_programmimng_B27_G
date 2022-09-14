package day16_string_methods_3;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first name");
        String firstName = input.next();
        System.out.println("last name");
        String lastName = input.next();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println(firstName);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(lastName);



    }

}
