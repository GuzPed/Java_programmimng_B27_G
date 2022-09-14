package homework_practice.String_practices;

import java.util.Scanner;

public class Task11 {
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
        System.out.println("Enter 1 word");
        String firstWord = input.next();
        System.out.println("Enter 2 word");
        String secondWord = input.next();

        if (firstWord.length()!=6 && secondWord.length()!=6) {
            System.out.println("Invalid data");
        }  else {
            System.out.println(firstWord.substring(0,4).toLowerCase() + secondWord.substring(secondWord.length()-3).toLowerCase() + "@cydeo.com");
        }




    }
}
