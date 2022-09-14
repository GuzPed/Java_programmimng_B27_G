package day16_string_methods_3;

import java.util.Scanner;

public class CreateId {
    public static void main(String[] args) {
        /*        [Create ID]
Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first name");
        String firstName = input.next().toLowerCase();
        System.out.println("Enter your last name");
        String lastName = input.next().toLowerCase();
        int length = firstName.length()*2;

        System.out.println(firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase()+lastName.substring(1,3)+length);
    }}
