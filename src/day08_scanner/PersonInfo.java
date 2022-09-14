package day08_scanner;

import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first name");
        String a = input.next();
        System.out.println("Enter you last name");
        String b = input.next();
        input.nextLine(); // for the enter input
        System.out.println("Enter you address");
        String c = input.nextLine();

        System.out.println(a + " " + b + ", your address is " + c);


    }

}
