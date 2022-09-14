package day14_string_methods_1;

import java.util.Scanner;

public class HomeWorkStringMethod2 {
    public static void main(String[] args) {
        /*
        Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password
         */
       //1 solution
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your password");
        String userPassword = input.nextLine();
        if (userPassword.length() > 8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        System.out.println("__________________________________");
        //2 solution
        String passcode = "Mdsfidhf$hds-340";
                if (passcode.equals("Mdsfidhf$hds-341")) {
                    System.out.println("Valid password");
                } else {
                    System.out.println("Invalid password");
                }


    }
}
