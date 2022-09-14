package day11_nested_if_statement;

import java.util.Scanner;

/*
declare and assign two expected numbers:
	pincode: 1234
	ssn: 1111

ask the user to enter the two numbers and compare them with the system values defined above. If they match print Authentication successful

if they don't match print all the reasons that authentication failed:

	if the pincode was incorrect print: Pin Code is incorrect
	if the ssn was incorrect print: Last 4 SSN numbers are incorrect

 */
public class Pincode {
    public static void main(String[] args) {
        int pincode = 1234;
        int ssn = 1111;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter pincode and ssn");
        int userPincode = input.nextInt();
        int userSsn = input.nextInt();

        if (userPincode == pincode && userSsn == ssn) {
            System.out.println("Authentication successful");
        } else {
            if (userPincode!=pincode && userSsn!= ssn){
                System.out.println("Both Data are incorrect");
            } else if (userSsn!= ssn) {
                System.out.println("Last 4 SSN numbers are incorrect");
            } else {
                System.out.println("Pin Code is incorrect");
            }
        }


        System.out.println("______________________________________");
        String a = userPincode == pincode && userSsn == ssn? "Authentication successful" : userPincode!=pincode && userSsn!= ssn? "Both Data are incorrect" : userSsn!= ssn? "Last 4 SSN numbers are incorrect" : "Pin Code is incorrect";
        System.out.println(a);



    }


}
