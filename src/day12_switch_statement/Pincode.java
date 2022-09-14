package day12_switch_statement;

import java.util.Scanner;

public class Pincode {
    public static void main(String[] args) {
        int systemPincode = 1234;
        int systemSsn = 1111;

        Scanner input = new Scanner (System.in);
        System.out.print("Enter pincode ");
        int pincode = input.nextInt();
        System.out.print("enter ssn ");
        int ssn = input.nextInt();

        if (pincode == systemPincode && ssn == systemSsn) {
            System.out.println("Authentication successful");
        } else {
            if (pincode!= systemPincode) {
                System.out.println("Pincode is incorrect");
            }
            if (ssn!= systemSsn) {
                System.out.println("last 4 SSN numbers are incorrect");
            }
        }




    }


}
