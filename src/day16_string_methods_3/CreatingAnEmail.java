package day16_string_methods_3;

import java.util.Scanner;

public class CreatingAnEmail {
    public static void main(String[] args) {
        /*
        [Creating an email]

Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.

If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cydeo.com” and print the final string as your created email.
The final email should be in all lowercase.

    input:
        JamesBond
        Secret
    output:
        jameret@cydeo.com
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name and last name combined without a space. min 6 characters long");
        String word1 = input.next().toLowerCase();
        System.out.println("Enter any word,at least 6 characters long");
        String word2= input.next().toLowerCase();
        int lengthWord2 = word2.length();

        if (word1.length()<6 && word2.length()<6) {
            System.out.println("Invalid data");
        } else {
            System.out.println(word1.substring(0,4)+word2.substring((lengthWord2-3))+"@cydeo.com");
        }






    }


}
