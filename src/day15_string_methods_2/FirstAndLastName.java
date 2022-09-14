package day15_string_methods_2;

import java.util.Scanner;

public class FirstAndLastName {
    /*
    create a program to ask the user to enter their first name and last name.
Then print the initials of the person in uppercase format.
The intials are made up of the first letters of the first and last names.

	Ex:
		james
		bond

		JB

	Ex:
		anna
		lee

		AL
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter you first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println(""+firstName.toUpperCase().charAt(0)+lastName.toUpperCase().charAt(0));






    }




}
